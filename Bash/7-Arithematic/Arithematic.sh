#! /bin/bash

read eq
sol=$(echo "scale=4;$eq" | bc)
printf "%.3f\n" "$sol"
