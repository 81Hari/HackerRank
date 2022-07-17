from itertools import permutations
def main():
    S = input().split()
    P = list(permutations(S[0],int(S[1])))
    P.sort()
    for i in P:
        print("".join(i))

if __name__ =='__main__':
    main()
