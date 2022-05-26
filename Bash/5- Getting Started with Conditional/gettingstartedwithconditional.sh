#! /bin/bash

read ch

if [[ $ch == "Y" || $ch == "y" ]]
then
    echo "YES"
elif [[ $ch == "N" || $ch == "n" ]]
then
    echo "NO"
fi

