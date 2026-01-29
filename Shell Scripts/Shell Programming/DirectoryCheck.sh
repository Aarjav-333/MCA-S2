#!/bin/bash

echo "Enter name (file or directory):"
read name

if [ -d "$name" ]; then
    echo "$name is a directory"
else
    echo "$name is not a directory"
fi
