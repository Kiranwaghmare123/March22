#!/bin/sh

echo "Guess number"
read n

if [[ ( $n -lt 100 ) && ( $n%2 -eq 0 ) ]];
then
	echo "Even number."
else
	echo "Odd number."
fi
