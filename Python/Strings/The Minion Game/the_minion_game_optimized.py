def minion_game(string):
    string = string.upper()
    kevin = dict()
    stuart = dict()
    k_in = list()
    s_in = list()
    j=0

    for i in string:
        if i == 'A' or i == 'E' or i == 'I' or i == 'O' or i == 'U':
            k_in.append(j)
        else:
            s_in.append(j)
        j+=1

    s_sum=0
    k_sum=0
    for i in k_in:
        k_sum = k_sum + len(string)-i

    for i in s_in:
        s_sum = s_sum + len(string)-i

    if(k_sum<s_sum):
        print("Stuart " + str(s_sum))
    elif(k_sum>s_sum):
        print("Kevin " + str(k_sum))
    else:
        print("Draw")


if __name__ == '__main__':
    s = input()
    minion_game(s)
