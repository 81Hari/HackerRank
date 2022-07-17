def print_rangoli(size):
    pattern = ""
    sub = "-"
    j = 2
    upper = ""
    if size == 1:
        print("a")

    else:
        for i in range(int((2*size)/2)):
            if i == 0:
                pattern = str(chr(ord('a') + size -1-i)) + sub[::-1]
            else:
                pattern = sub + str(chr(ord('a') + size -1-i)) + sub[::-1]
            sub = pattern[:j]
            j = j+2

            if i != int((2*size)/2)-1:
                upper = upper + pattern.center(4*size-3,"-") + "\n"
            print(pattern.center(4*size-3,"-"))


    upper = upper[:len(upper)-1]
    lower = upper[::-1]
    print(lower)


if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
