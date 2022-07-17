from collections import deque

def main():
    T = int(input())
    for i in range(T):
        n = int(input())
        d = deque(list(map(int,input().split())))
        temp = 2**31
        flag = 'Yes'
        for j in range(n):
            if d[0] <= d[len(d)-1] and d[len(d)-1]<=temp:
                temp = d.pop()
            elif d[0]<=temp:
                temp = d.popleft()
            else:
                flag = 'No'
                break
        print(flag)

if __name__ == '__main__':
    main()
