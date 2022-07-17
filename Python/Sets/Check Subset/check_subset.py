def main():
    T = int(input())
    for i in range(T):
        N = int(input())
        A = set(map(int,input().split()))
        N = int(input())
        B = set(map(int,input().split()))
        print(len(A-B) == 0)

if __name__ == "__main__":
    main()

