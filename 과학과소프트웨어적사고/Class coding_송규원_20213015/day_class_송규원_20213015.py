from datetime import datetime
from dateutil.relativedelta import relativedelta

class Dayfinding:
    
#x일 후 날짜 구하는 함수
    def day_1(self):

        self.my_date=datetime(y,m,d)

        self.x=int(input("\n>> x 입력 (x일 후 계산을 위한):"))
        self.new_date=self.my_date + relativedelta(days=self.x)

        return self.new_date

    #x일 후 요일 구하는 함수
    def day_2(self):
        self.year = y
        self.month = m
        self.day = d

        month_days = [0,31,28,31,30,31,30,31,30,31,30,31,30]

        self.n = 0

        for year_item in range(1, self.year):
            self.n = self.n + 365
             
            if year_item % 400 == 0:
                self.n = self.n + 1           
            elif year_item % 100 == 0:
                pass           
            elif year_item % 4 == 0:
                self.n = self.n + 1           
            else:
                pass
                
        for month_index in range(1, self.month):
            self.n = self.n + month_days[month_index]
           
        self.n = self.n + self.day

        if self.year % 400 == 0 and self.month >= 3:
         self.n = self.n + 1
        elif year_item % 100 == 0:
         pass         
        elif self.year % 4 == 0 and self.month >= 3:
         self.n = self.n + 1
        else:
         pass

        return self.n
        


#main
myDay = Dayfinding()

y = int(input(">> 년도 입력:"))
m = int(input(">> 월 입력:"))
d = int(input(">> 일 입력:"))

a = myDay.day_1()

print("\n>> x일 후 날짜:", a, end='')

b = myDay.day_2()

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






