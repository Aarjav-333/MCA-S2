#!/bin/bash

echo "Enter directory name:"
read dir

if [ -d "$dir" ]; then
    count=$(ls -l "$dir" | grep "^-" | wc -l)
    echo "Number of files in $dir: $count"
else
    echo "Directory not found"
fi