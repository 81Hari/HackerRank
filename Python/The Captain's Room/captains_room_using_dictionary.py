def main():
    k = int(input())
    dic = {}
    for i in input().split():
        dic[i] = dic.get(i,0) + 1
    for i in dic:
        if dic[i] != k:
            print(i)
            break

if __name__ == "__main__":
    main()

