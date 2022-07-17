from itertools import combinations

def main():
    S = input().split()
    output = list()
    for i in range(1,int(S[1])+1):
        temp = ["".join(i) for i in list(combinations(S[0],i))]
        for j in range(len(temp)):
            temp[j] = list(temp[j])
            temp[j].sort()
            temp[j] = "".join(temp[j])
        temp.sort()
        output = output + temp

    for i in output:
        print(i)

if __name__=='__main__':
    main()

