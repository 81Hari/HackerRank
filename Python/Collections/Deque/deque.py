from collections import deque

def main():
    N = int(input())
    q = deque()
    for i in range(N):
        methods = input().split()
        if methods[0] == 'append':
              q.append(int(methods[1]))
        elif methods[0] == 'appendleft':
            q.appendleft(int(methods[1]))
        elif methods[0] == 'pop':
            q.pop()
        elif methods[0] == 'popleft':
            q.popleft()
    for i in q:
        print(i,end=' ')



if __name__=='__main__':
    main()
