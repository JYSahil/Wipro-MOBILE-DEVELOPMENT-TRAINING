#!/bin/bash
mkdir -p TestDir
cd TestDir
# Create ten files with their filenames as content
for i in $(seq 1 10); do
    
    file_name=$(printf "File%02d.txt" "$i")
    
    # Write filename to the file
    echo "$file_name" > "$file_name"
done
echo "Files have been created successfully in TestDir."