"""
                    0   0   0
array   -           0   0   0
                    0   0   0




                    0
Right diagonal -        0
                            0

---------------------------------------

                            0
Left diagonal-           0
                    0
"""

def diagonalDifference(arr):
    n = len(arr)
    sum_l = 0
    sum_r = 0
    for i in range(0,n):
        sum_r = sum_r + arr[i][i]       #Right Diagonal
        sum_l = sum_l + arr[n-1-i][i]   #Left Diagonal
    dDiff = abs(sum_l-sum_r)
    return dDiff

def main():
    n = int(input().strip())

    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))

    result = diagonalDifference(arr)
    print(result)

if __name__ == '__main__':
    main()
