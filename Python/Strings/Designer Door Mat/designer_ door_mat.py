if __name__ == '__main__':

    while(True):

        N,M = map(int,input().split(" "))

        if (N%2 == 0 or M != 3*N):
            print("Please follow input constraints")
        else:
            break
    k = 1

    for i in range(1,int((N-1)/2)+1):
        print((".|."*k).center(M,"-"))
        k=k+2
    k=k-2
    print("WELCOME".center(M,"-"))

    for i in range(1,int((N-1)/2)+1):
        print((".|."*k).center(M,"-"))
        k=k-2


    # for i in range(1,int((N-1)/2)+1):
    #     print("-"*int(((M-3*k)/2)),end="")
    #     print(".|."*k,end="")
    #     print("-"*int(((M-3*k)/2)))
    #     k = k + 2

    # print("-"*int((M-7)/2) + "WELCOME" + "-"*int((M-7)/2))

    # k = k-2
    # for i in range(1,int((N-1)/2)+1):
    #     print("-"*int(((M-3*k)/2)),end="")
    #     print(".|."*k,end="")
    #     print("-"*int(((M-3*k)/2)))
    #     k = k - 2
