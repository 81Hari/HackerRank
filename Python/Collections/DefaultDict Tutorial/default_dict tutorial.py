from collections import defaultdict

def main():
    n,m = map(int,input().split())

    A = list()
    for i in range(n):
        A.append(input())

    B = list()
    for i in range(m):
        B.append(input())

    d = defaultdict(list)

    for i in range(n):
        d[A[i]].append(i+1)

    for i in B:
        if d[i] == []:
            d[i].append(-1)

    for i in B:
        for j in d[i]:
            print(j,end=" ")
        print("")


if __name__  == '__main__':
    main()
