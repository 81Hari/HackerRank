from itertools import product
def main():
    A = list(map(int,input().split()))
    B = list(map(int,input().split()))

    print(*product(A,B))
    # for i in list(product(A,B)):
    #     print(i,end=" ")

if __name__ == '__main__':
    main()
