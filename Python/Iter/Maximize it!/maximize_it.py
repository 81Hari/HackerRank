from itertools import product

def main():
    K,M = map(int,input().split())
    A = list()

    for i in range(K):
        A.append(list(map(lambda i:(int(i)**2)%M,input().split()[1:])))

    C_P = list(product(*A))
    A  = max(list(map(lambda i:sum(i)%M,C_P)))
    print(A)


    # for i in range(K):
    #     A.append(list(map(int,input().split())))

    # temp = A[0]
    # temp = list(map(lambda i:i**2,temp))
    # for i in range(1,K):
    #     C_P = list(product(temp,A[i]))
    #     temp.clear()
    #     for j in C_P:
    #         temp.append((j[0]) +(j[1]**2))

    # C_P = list(map(lambda i:i%M,temp))

    # print(max(C_P))


if __name__ == '__main__':
    main()

"""
(A+B) mod K = ((A mod K) + (B mod K)) mod K
"""
