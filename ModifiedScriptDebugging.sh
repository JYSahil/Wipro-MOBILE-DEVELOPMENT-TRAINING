#!/bin/bash
DIR_NAME="TestDir"
DEBUG_MODE=false

while getopts "d" opt; do
    case $opt in
        d)
            DEBUG_MODE=true
            ;;
        \?)
            echo "Invalid option: -$OPTARG" >&2
            exit 1
            ;;
    esac
done

debug() {
    if [ "$DEBUG_MODE" = true ]; then
        echo "[DEBUG] $1"
    fi
}

if [ -d "$DIR_NAME" ]; then
    echo "Directory '$DIR_NAME' already exists."
else
    debug "Creating directory '$DIR_NAME'."
    mkdir "$DIR_NAME" 2>/dev/null
    if [ $? -ne 0 ]; then
        echo "Error: Could not create directory '$DIR_NAME'. Check permissions."
        exit 1
    fi
    debug "Directory '$DIR_NAME' created successfully."
fi

cd "$DIR_NAME" || { echo "Error: Could not change to directory '$DIR_NAME'."; exit 1; }

for i in $(seq 1 10); do
    # Create filename with zero-padding (e.g., File01.txt)
    file_name=$(printf "File%02d.txt" "$i")
    
    debug "Creating file '$file_name'."
    # Write filename to the file
    echo "$file_name" > "$file_name" 2>/dev/null
    if [ $? -ne 0 ]; then
        echo "Error: Could not create file '$file_name'. Check permissions."
        exit 1
    fi
    debug "File '$file_name' created successfully."
done

echo "Files have been created successfully in '$DIR_NAME'."
