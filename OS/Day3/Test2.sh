#!/bin/sh
#Method 1:
name=$(ls)

#Method 2:
content=`ls`

str="CDAC"

echo "Hi !, ${str}"
echo "$content"

echo "$name"


