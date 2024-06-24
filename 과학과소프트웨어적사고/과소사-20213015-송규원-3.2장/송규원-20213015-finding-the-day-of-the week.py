year = int(input("년도를 입력하시오 : "))
month = int(input("월을 입력하시오 : "))
day = int(input("일을 입력하시오 : "))

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

print(year,"년",month,"월",day,"일")

if year % 400 == 0 and month >= 3:
 n = n + 1
elif year_item % 100 == 0:
 pass         
elif year % 4 == 0 and month >= 3:
 n = n + 1
else:
 pass

if n % 7 == 0:
    print("일요일")
elif n % 7 == 1:
    print("월요일")
elif n % 7 == 2:
    print("화요일")
elif n % 7 == 3:
    print("수요일")
elif n % 7 == 4:
    print("목요일")
elif n % 7 == 5:
    print("금요일")
elif n % 7 == 6:
    print("토요일")

