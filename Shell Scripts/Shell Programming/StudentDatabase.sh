#!/bin/bash

file="student.txt"

while true
do
echo "------ Student Database ------"
echo "1. Add Record"
echo "2. View Records"
echo "3. Delete Record"
echo "4. Exit"
echo "Enter your choice:"
read ch

case $ch in

1)
echo "Enter Student ID:"
read id
echo "Enter Student Name:"
read name
echo "Enter Course:"
read course
echo "$id | $name | $course" >> $file
echo "Record Added"
;;

2)
echo "Student Records:"
cat $file
;;

3)
echo "Enter Student ID to delete:"
read id
grep -v "^$id" $file > temp.txt
mv temp.txt $file
echo "Record Deleted"
;;

4)
exit
;;

*)
echo "Invalid Choice"
;;

esac
done