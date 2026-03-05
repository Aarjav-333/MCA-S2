#!/bin/bash

echo "Enter first string:"
read str1

echo "Enter second string:"
read str2

echo "Enter third string (optional):"
read str3

result="$str1$str2$str3"

echo "Combined string: $result"