#!/bin/bash

read filename

if [ -e $filename ] 
then
mv $filename $filename.sh
sudo chmod +x $filename.sh
else 
echo "File not found"
fi
