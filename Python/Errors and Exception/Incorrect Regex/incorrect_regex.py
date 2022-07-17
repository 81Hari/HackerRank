import re

def main():
    n = int(input())

    for i in range(n):
        S = input()
        try:
            re.compile(S)
            print(True)
        except re.error:
            print(False)


if __name__ == '__main__':
    main()
