#!/bin/bash

echo "Enter a string:"
read str

echo "Enter starting position (0-based index):"
read start

echo "Enter length of substring:"
read len

substr=${str:$start:$len}

echo "Substring is: $substr"