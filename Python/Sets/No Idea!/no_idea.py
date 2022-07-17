def main():
    n,m = map(int,input().split())
    Arr = list(map(int,input().split()))[:n]
    A = set(map(int,input().split()))
    B = set(map(int,input().split()))


    A = A.intersection(Arr)
    B = B.intersection(Arr)

    happiness = len(A)-len(B)
    print(happiness)



if __name__ == '__main__':
    main()
