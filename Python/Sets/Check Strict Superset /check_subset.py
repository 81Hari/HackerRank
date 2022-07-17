def main():
    A = set(map(int,input().split()))
    T = int(input())
    for i in range(T):
        B = set(map(int,input().split()))
        if len(B-A) !=0:
            print(len(B-A) == 0)
            exit()
    print(len(B-A) == 0)

if __name__ == "__main__":
    main()

