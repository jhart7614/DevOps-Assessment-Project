#!/bin/bash

read x

i=0
while [ $i -le $x ]
do
if [$x -eq 0 ]
then
echo "Not Prime"
exit
fi
i =$i + 1
done
echo "Prime"
