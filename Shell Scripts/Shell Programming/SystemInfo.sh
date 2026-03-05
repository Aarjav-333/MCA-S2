#!/bin/bash

echo "1. Count of users logged in:"
who | wc -l

echo ""
echo "2. Column list of files in Home Directory:"
ls $HOME

echo ""
echo "3. Processes with below normal priority:"
ps -al