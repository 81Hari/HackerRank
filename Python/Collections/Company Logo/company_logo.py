#!/bin/python3

import math
import os
import random
import re
import sys
from collections import Counter as Count


if __name__ == '__main__':
    s = input()
    count = Count(s)
    count_list = [(c,co) for c,co in count.items()]
    count_list.sort(key =lambda i:i[0])
    count_list.sort(reverse=True,key=lambda i:i[1])
    for i in range(3):
        print(count_list[i][0],count_list[i][1])
