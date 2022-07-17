from collections import OrderedDict

def main():
    N = int(input())
    words = OrderedDict()
    for i in range(N):
        word = input()
        if word in words.keys():
            words[word]+=1
        else:
            words[word] = 1

    print(len(words.keys()))

    for i in words.keys():
        print(words[i],end=" ")

if __name__ =='__main__':
    main()
