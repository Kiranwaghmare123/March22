#!/bin/sh


echo "Guess number:"
read n
if [ $n -lt 10 ];
then
	echo "It is one digit number."
else
	echo "It is two digit number."
fi
