from collections import OrderedDict

def main():
    N = int(input())
    item_sold = OrderedDict()
    for i in range(N):
        item=input().split()
        item_name = " ".join(item[:len(item)-1])
        netprice = int(item[len(item)-1])
        if item_name in item_sold.keys():
            item_sold[item_name] = item_sold[item_name] + netprice
        else:
            item_sold[item_name] = netprice
    for i,j in item_sold.items():
        print(i,j)


if __name__ == '__main__':
    main()
