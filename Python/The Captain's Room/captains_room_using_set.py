def main():
    K = int(input())
    room = list(map(int,input().split()))
    room_set1 = set(room)
    for i in list(room_set1):
        room.remove(i)
    room_set2 = set(room)
    captian_room = room_set1 - room_set2
    print(captian_room.pop())

if __name__ == "__main__":
    main()

