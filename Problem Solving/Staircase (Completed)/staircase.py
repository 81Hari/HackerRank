def staircase(n):
    for i in range(n):
        for j in range(n):
            if(i<n-j-1):
                print("",end=" ")
            else:
                print("#",end="")
        print("")


def main():
    n = int(input().strip())

    staircase(n)

if __name__ == '__main__':
    main()
