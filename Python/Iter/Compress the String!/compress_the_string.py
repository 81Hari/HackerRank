from itertools import groupby

def main():
    S = input()
    S = list(S)
    for key, group in(groupby(S)):
        print("("+str(len(list(group)))+", "+str(key)+")",end=" ")


if __name__ =='__main__':
    main()

