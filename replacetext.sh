#!/bin/bash

if [ "$#" -ne 3 ]; then
    echo "Usage: $0 input_file old_text new_text"
    exit 1
fi
input_FILE="$1"
old_TEXT="$2"
new_TEXT="$3"
output_FILE="output_file.txt"

if [ ! -f "$input_FILE" ]; then
    echo "Error: Input file '$input_FILE' does not exist."
    exit 1
fi

sed "s/${old_TEXT}/${new_TEXT}/g" "$input_FILE" > "$output_FILE"

if [ $? -eq 0 ]; then
    echo "Replacement completed successfully. Output written to '$output_FILE'."
else
    echo "Error: Replacement failed."
    exit 1
fi