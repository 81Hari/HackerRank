#! /bin/bash

read x
read y

if [ $x -gt $y ];                  # -gt -> greater than
    then
        echo "X is greater than Y"
    elif [ $x -eq $y ];                # -eq -> equal to
        then
            echo "X is equal to Y"
        elif [ $x -lt $y ];                # -lt -> less than
            then
                echo "X is less than Y"
fi
