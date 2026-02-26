#!/bin/bash

echo "Enter a number:"
read num

reverse=0

while [ $num -gt 0 ]
do
    digit=$((num % 10))        # Get last digit
    reverse=$((reverse * 10 + digit))  # Build reverse number
    num=$((num / 10))          # Remove last digit
done

echo "Reversed number is: $reverse"