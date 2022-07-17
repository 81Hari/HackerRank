from collections import namedtuple

def main():
    N = int(input())
    column_names = input()
    Student = namedtuple('Student',column_names)
    student = list()
    avg = 0
    for i in range(N):
        temp = input().split()
        student.append(Student(temp[0],temp[1],temp[2],temp[3]))
        avg = avg + int(student[i].MARKS)

    avg = avg/N
    print(format(avg,'.2f'))
if __name__ == '__main__':
    main()
