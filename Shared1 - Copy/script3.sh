#!/bin/bash


if [[ -f logfile2.txt ]]; then 
read -p "file logfile2.txt exists. Do you want to delete [y/n]" delete
if [[ $delete == [yY] ]]; then 
rm "logfile2.txt" && echo "file deleted"
fi 
else
echo "File logfile2.txt does not exist"
fi

exec&> logfile2.txt
w
hostname --ip-address

