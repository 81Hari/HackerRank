def timeConversion(s):
    t = ord(s[0])-48
    t = t*10 + ord(s[1]) - 48
    if(s[8] == 'P' and t!=12):
        s = s[:1] + chr((t + 12)%10 + 48) + s[2:]
        s = s[:0] + chr(int((t + 12)/10) + 48) + s[1:]
    elif(s[8] == 'A' and t==12):
        s = s[:0] + "00" + s[2:]

    s = s[:-2]

    print(s)

def main():
    s = input()
    timeConversion(s)
if __name__ == '__main__':
    main()
