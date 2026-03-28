#!/bin/bash

# 1) Create file using cat
cat > myfile.txt <<EOF
1001   Neha    95
1002   Ram     87
1003   Divya   77
1004   Rahul   65
1005   Arun    99
1006   Nisha   76
EOF

echo "File 'myfile.txt' created successfully."
echo "----------------------------------"

# 2) Print first 2 rows
echo "First 2 rows:"
head -n 2 myfile.txt
echo "----------------------------------"

# 3) Print last 2 rows
echo "Last 2 rows:"
tail -n 2 myfile.txt
echo "----------------------------------"

# 4) Copy contents to another file
cp myfile.txt mycopyfile.txt
echo "Contents copied to 'mycopyfile.txt'."
echo "----------------------------------"

# 5) Count lines, words, characters
echo "Count of lines, words, characters:"
wc myfile.txt
echo "----------------------------------"

# 6) Print 3rd row only
echo "3rd row of file:"
sed -n '3p' myfile.txt
echo "----------------------------------"

# 7) Append contents to another file
cat myfile.txt >> myappendfile.txt
echo "Contents appended to 'myappendfile.txt'."
echo "----------------------------------"