#!/bin/bash

echo "Enter a number:"
read num

temp=$num
sum=0

# find number of digits
digits=${#num}

while [ $temp -gt 0 ]
do
    rem=$((temp % 10))
    power=1

    for((i=1;i<=digits;i++))
    do
        power=$((power * rem))
    done

    sum=$((sum + power))
    temp=$((temp / 10))
done

if [ $sum -eq $num ]
then
    echo "$num is an Armstrong number"
else
    echo "$num is NOT an Armstrong number"
fi