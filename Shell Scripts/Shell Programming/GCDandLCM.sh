#!/bin/bash

echo "Enter first number:"
read a

echo "Enter second number:"
read b

x=$a
y=$b

# Find GCD
while [ $b -ne 0 ]
do
    temp=$b
    b=$((a % b))
    a=$temp
done

gcd=$a

# Find LCM
lcm=$(( (x * y) / gcd ))

echo "GCD = $gcd"
echo "LCM = $lcm"