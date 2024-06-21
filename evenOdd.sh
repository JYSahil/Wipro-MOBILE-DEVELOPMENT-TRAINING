#!/bin/bash
while true; do
    echo "Enter a number (or 0 to stop):"
    read number
    if ! [[ "$number" =~ ^-?[0-9]+$ ]]; then
        echo "Please enter a valid integer."
        continue
    fi
    if (( number % 2 == 0 )); then
        echo "number is even."
    else
        echo "number is odd."
    fi
done