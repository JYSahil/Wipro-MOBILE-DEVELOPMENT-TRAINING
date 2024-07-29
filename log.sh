#!/bin/bash
LOG_FILE="logfile.txt"

if [ ! -f "$LOG_FILE" ]; then
    echo "Log file '$LOG_FILE' does not exist."
    exit 1
fi

grep "ERROR" "$LOG_FILE" | awk '{print $1, $2, substr($0, index($0,$3))}' | sed 's/ERROR //'