from itertools import combinations_with_replacement

def main():
    S = input().split()
    S[0] = list(S[0])
    S[0].sort()
    output = ["".join(i) for i in combinations_with_replacement(S[0],int(S[1]))]
    for i in output:
        print(i)

if __name__ == '__main__':
    main()
