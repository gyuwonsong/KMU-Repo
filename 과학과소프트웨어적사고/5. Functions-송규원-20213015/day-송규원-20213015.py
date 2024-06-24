from datetime import datetime
from dateutil.relativedelta import relativedelta

#x일 후 날짜 구하는 함수
def day_1():

    my_date=datetime(y,m,d)

    x=int(input("\n>> x 입력 (x일 후 계산을 위한):"))
    new_date=my_date + relativedelta(days=x)

    return new_date

#x일 후 요일 구하는 함수
def day_2():
    year=y
    month=m
    day =d

    month_days = [0,31,28,31,30,31,30,31,30,31,30,31,30]

    n = 0

    for year_item in range(1, year):
        n = n + 365
         
        if year_item % 400 == 0:
            n = n + 1           
        elif year_item % 100 == 0:
            pass           
        elif year_item % 4 == 0:
            n = n + 1           
        else:
            pass
            
    for month_index in range(1, month):
        n = n + month_days[month_index]
       
    n = n + day

    if year % 400 == 0 and month >= 3:
     n = n + 1
    elif year_item % 100 == 0:
     pass         
    elif year % 4 == 0 and month >= 3:
     n = n + 1
    else:
     pass

    return n
    

#main
y=int(input(">> 년도 입력:"))
m=int(input(">> 월 입력:"))
d=int(input(">> 일 입력:"))
    
a=day_1()

print("\n>> x일 후 날짜:", a, end='')

b=day_2()

if b % 7 == 0:
    print(" 일요일")
elif b % 7 == 1:
    print(" 월요일")
elif b % 7 == 2:
    print(" 화요일")
elif b % 7 == 3:
    print(" 수요일")
elif b % 7 == 4:
    print(" 목요일")
elif b % 7 == 5:
    print(" 금요일")
elif b % 7 == 6:
    print(" 토요일")



