#!/bin/bash
#Tenth Line - Read only the tenth line of a file.

counter=0
while [ $counter -lt 10 ];
do
read line
counter=$((counter+1)) 
done < $1
echo $line
