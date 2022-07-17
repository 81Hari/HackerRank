def count_substring(string, sub_string):
    pie_table = [0]
    j = 0
    for i in range(1,len(sub_string)):
        if sub_string[i] == sub_string[j]:
            pie_table.append(j+1)
            j+=1
        else:
            pie_table.append(0)
            j=0
    j=0
    count = 0
    for i in range(0,len(string)):
        if string[i] == sub_string[j]:
            if j == len(sub_string)-1:
                count+=1
                j = pie_table[j]
            else:
                j=j+1
        else:
            j = pie_table[j]



    return count

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()

    count = count_substring(string, sub_string)
    print(count)
