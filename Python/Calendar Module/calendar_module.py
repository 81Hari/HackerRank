import calendar as cal

def main():
    month,day,year = map(int,input().split())
    day_names = ['MONDAY','TUESDAY','WEDNESDAY','THURSDAY','FRIDAY','SATURDAY','SUNDAY']
    day_no = cal.weekday(year,month,day)
    print(day_names[day_no])

if __name__ == '__main__':
    main()
