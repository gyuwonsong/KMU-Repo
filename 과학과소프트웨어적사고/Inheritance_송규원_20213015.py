class Metaclass:

    def fibo_meta(self, number_of_n):

        self.m = number_of_n
        a = 1
        b = 1
        
        if self.m ==1 or self.m ==2:
            return 1
            
        for i in range(1,self.m):
            a, b = b, a + b

        return a

    def tree_meta(self, c, d):

        self.c = c
        self.d = d
        
        tree_1(c, d)

    def hanoi_meta(self, in_n, in_start, in_end, in_mid):

        self.in_n = in_n
        self.in_start = in_start
        self.in_end = in_end
        self.in_mid = in_mid

        hanoi_1(in_n, in_start, in_end, in_mid)

    def day_meta_1(self, y, m, d):

        self.y = y
        self.m = m
        self.d = d
        
        my_date=datetime(y,m,d)

        x = int(input("\n>> x 입력 (x일 후 계산을 위한):"))
        new_date = my_date + relativedelta(days=x)

        return new_date

    def day_meta_2(self, y, m, d):

        self.y = y
        self.m = m
        self.d = d

        month_days = [0,31,28,31,30,31,30,31,30,31,30,31,30]

        n = 0

        for year_item in range(1, y):
            n = n + 365
             
            if year_item % 400 == 0:
                n = n + 1           
            elif year_item % 100 == 0:
                pass           
            elif year_item % 4 == 0:
                n = n + 1           
            else:
                pass
                
        for month_index in range(1, m):
            n = n + month_days[month_index]
           
        n = n + d

        if y % 400 == 0 and m >= 3:
            n = n + 1
        elif year_item % 100 == 0:
         pass         
        elif y % 4 == 0 and m >= 3:
            n = n + 1
        else:
         pass

        return n
        





    
#피보나치 수 하위 클래스
class Fibo(Metaclass):
    
    def __init__(self, number):
        print(">> 입력된 n값:", number)
        x = super().fibo_meta(number)
        print(">> n값의 피보나치 수:", x)


#재귀나무 그리기 하위 클래스
class Tree(Metaclass):

    def __init__(self, t, lineLength):

        self.t = t
        self.lineLength = lineLength

        if lineLength > 0:

            b = super().tree_meta(t, lineLength)

def tree_1(o, p):

    angle = 30

    if p > 0:
        t.forward(p)
        t.left(angle)
        tree_1(o, p-10)

        t.right(angle)
        t.right(angle)
        tree_1(o, p-10)

        t.left(angle)
        t.backward(p)

        p = p-10
    return 


#하노이 탑 하위 클래스
class Hanoi(Metaclass):

    def __init__(self, n, start, mid, end):

        self.n = n
        self.start = start
        self.mid = mid
        self.end = end
        
        if  n == 1:
            print("%d : %c -> %c" %(n, start, end))
        else:
            q = super().hanoi_meta(n-1, start, end, mid)

def hanoi_1(w, e, r, z):

    while w > 1 :
        print("%d : %c -> %c" %(w+1, e, r))
        w = w-1
        hanoi_1(w, e, r, z)


#날짜 구하기 하위 클래스
class Dayfinding(Metaclass):

    def __init__(self, in_year, in_month, in_day):
        
        self.in_year = in_year
        self.in_month = in_month
        self.in_day = in_day

        g = super().day_meta_1(in_year, in_month, in_day)
        f = super().day_meta_2(in_year, in_month, in_day)

        print("\n>> x일 후 날짜:", g, end='')
        
        if f % 7 == 0:
            print(" 일요일")
        elif f % 7 == 1:
            print(" 월요일")
        elif f % 7 == 2:
            print(" 화요일")
        elif f % 7 == 3:
            print(" 수요일")
        elif f % 7 == 4:
            print(" 목요일")
        elif f % 7 == 5:
            print(" 금요일")
        elif f % 7 == 6:
            print(" 토요일")






       
#피보나치 수 메인
print(">> 1) Fibonacci Main")

n=int(input("\n>> n값 입력:"))
fibo_m = Fibo(n)


#재귀나무 그리기 메인
print("\n\n>> 2) Tree Main")
import turtle

s = turtle.Screen()
t = turtle.Turtle()

lineLength=60
t.left(90)

a = Tree(t, lineLength)


#하노이 탑 메인
print("\n\n>> 3) Hanoi Main")

m=int(input("\n>> m값 입력:"))
h = Hanoi(m, 'A', 'B', 'C')


#날짜 구하기 메인
print("\n\n>> 4) Day Main")
from datetime import datetime
from dateutil.relativedelta import relativedelta

year = int(input("\n>> 년도 입력:"))
month = int(input(">> 월 입력:"))
day = int(input(">> 일 입력:"))

myDay = Dayfinding(year, month, day)




