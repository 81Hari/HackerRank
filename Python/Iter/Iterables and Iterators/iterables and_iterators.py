from itertools import combinations

def main():
    N = int(input())
    letters = list(input().split())[:N]
    K = int(input())

    select = list(combinations(letters,K))
    count = 0
    for i in select:
        if 'a' in i:
            count+=1

    print(count/len(select))
if __name__ =='__main__':
    main()
