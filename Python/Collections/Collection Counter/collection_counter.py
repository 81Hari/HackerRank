from collections import Counter as Count

def main():
    X = int(input())
    shoe_list = list(map(int,input().split()))[:X]
    N = int(input())
    shoe_count = Count(shoe_list)
    profit = 0
    for i in range(N):
        shoe_size,shoe_price= map(int,input().split())
        shoe_count[shoe_size]-=1
        if(shoe_count[shoe_size]>=0):
            profit = profit + shoe_price
    print(profit)

if __name__ == '__main__':
    main()
