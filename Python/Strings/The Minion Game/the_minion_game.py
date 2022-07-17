def minion_game(string):
    kevin = dict()
    stuart = dict()
    k_in = list()
    s_in = list()
    j=0

    for i in string:
        if i == 'A' or i == 'E' or i == 'I' or i == 'O' or i == 'U':
            if i in kevin.keys():
                kevin[i] = kevin[i] + 1
            else:
                kevin[i] = 1
            k_in.append(j)
        else:
            if i in stuart.keys():
                stuart[i] = stuart[i] + 1
            else:
                stuart[i] = 1
            s_in.append(j)
        j+=1

    for i in k_in:
        sub = string[i]
        for j in range(i+1,len(string)):
            sub = sub + string[j]
            if sub in kevin.keys():
                kevin[sub] = kevin[sub] + 1
            else:
                kevin[sub] = 1

    for i in s_in:
        sub = string[i]
        for j in range(i+1,len(string)):
            sub = sub + string[j]
            if sub in stuart.keys():
                stuart[sub] = stuart[sub] + 1
            else:
                stuart[sub] = 1
    s_sum=0
    k_sum=0
    for i in stuart.keys():
        s_sum = s_sum + stuart[i]
    for i in kevin.keys():
        k_sum = k_sum + kevin[i]

    if(k_sum<s_sum):
        print("Stuart " + str(s_sum))
    else:
        print("Kevin " + str(k_sum))










if __name__ == '__main__':
    s = input()
    minion_game(s)
