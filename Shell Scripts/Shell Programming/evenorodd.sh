echo "Enter a no"
read num

if [ $((num % 2)) -eq 0 ]
then 
    echo "Even"
else 
    echo "Not Even"
fi