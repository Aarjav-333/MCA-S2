#!/bin/bash

# 1. Create a file and input a page profile
echo "Enter your profile (Press CTRL+D to finish):"
cat > profile.txt

# Copy profile to another existing file
echo "Enter the name of existing file to copy into:"
read file
cat profile.txt >> $file
echo "Profile copied to $file"

# 2. Start printing file at a certain line
echo "Enter file name to print from a certain line:"
read fname
echo "Enter starting line number:"
read line
tail -n +$line $fname

# 3. Print differences between two files and copy them
echo "Enter first file:"
read f1
echo "Enter second file:"
read f2
echo "Differences between files:"
diff $f1 $f2

cp $f1 copy_$f1
cp $f2 copy_$f2
echo "Files copied as copy_$f1 and copy_$f2"

# 4. Print lines matching a word pattern
echo "Enter file name to search:"
read searchfile
echo "Enter word pattern:"
read pattern
grep "$pattern" $searchfile