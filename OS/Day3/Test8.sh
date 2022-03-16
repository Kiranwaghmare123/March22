#!/bin/sh
#Addintion of two numbers
sum="20+30"

echo $sum
sum=(20+30)

echo $sum

(sum=20+30)

echo $sum

((sum=20+30))

echo $sum

string1="Linux"
string2="Programming"
string=$string1+$string2
echo $string

string=$string1$string2
echo $string



