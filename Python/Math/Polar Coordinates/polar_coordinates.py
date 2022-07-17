import cmath as cm
def main():
    c = input()
    if '-' in c[1:]:
        if c[0] == '-':
            c = c[1:].split("-")
            i = int(c[0])*(-1)
        else:
            c = c.split("-")
            i = int(c[0])
        j = int(c[1][:len(c[1])-1])*-1
    else:
        if c[0] == '-':
            c = c[1:].split("+")
            i = int(c[0])*(-1)
        else:
            c = c.split("+")
            i = int(c[0])
        j = int(c[1][:len(c[1])-1])

    print(abs(complex(i,j)))
    print(cm.phase(complex(i,j)))


if __name__ == "__main__":
    main()
