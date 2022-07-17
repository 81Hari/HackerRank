def main():
    M = int(input())
    A = set(map(int,input().split()))
    N = int(input())
    B = set(map(int,input().split()))
    D1 = A.difference(B)
    D2 = B.difference(A)
    D =  list(D1.union(D2))
    D.sort()


    for i in D:
        print(i)

if __name__ == '__main__':
    main()
