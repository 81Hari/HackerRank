def print_formatted(number):
    n = len(bin(number))-2
    for i in range(1,number+1):
        binary = str(bin(i))
        hexa = str(hex(i))
        octa = str(oct(i))
        print(str(i).rjust(n) + octa[2:].rjust(n+1) + hexa[2:].upper().rjust(n+1) + binary[2:].rjust(n+1))

if __name__ == '__main__':
    n = int(input())
    print_formatted(n)
