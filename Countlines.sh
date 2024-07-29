#!/bin/bash
echo "Script started."
count_lines() {
    local filename="$1"
    echo "Checking file: $filename"
    if [ -f "$filename" ]; then
        local line_count=$(wc -l < "$filename")
        echo "The file '$filename' has $line_count lines."
    else
        echo "The file '$filename' does not exist."
    fi
}
# Call the function with different filenames
count_lines "file1.txt"
count_lines "file2.txt"
count_lines "file3.txt"
count_lines "file4.txt"