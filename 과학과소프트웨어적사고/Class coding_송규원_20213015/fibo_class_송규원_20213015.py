import time

class Fibo:
    
    #일반함수를 이용한 피보나치 수열
    def fibonacci_1(self):

        self.n=int(input(">> n값 입력:"))
        
        self.a = 1
        self.b = 1
        
        if self.n==1 or self.n==2:
            return 1
            
        for i in range(1,self.n):
            self.a, self.b = self.b, self.a + self.b

        return self.a


#재귀함수를 이용한 피보나치 수열
def fibonacci_2(x):

    if x==1 or x==2:
        return 1
    else:
        return fibonacci_2(x-1) + fibonacci_2(x-2)
        

#main

f = Fibo()


#일반함수 사용시 시작 시간
normal_start=time.time()

c = f.fibonacci_1()

print(">> 일반함수를 이용한 n값의 피보나치 수: {}" .format(c))

normal_time=time.time()-normal_start
print(">> 일반함수 이용시 걸린 시간:", normal_time)

#재귀함수 사용시 시작 시간
recursion_start=time.time()

m=int(input("\n>> m값 입력:"))
g = fibonacci_2(m)
print(">> 재귀함수를 이용한 m값의 피보나치 수: {}" .format(g))

recursion_time=time.time()-recursion_start
print(">> 재귀함수 이용시 걸린 시간:", recursion_time)

#처리시간 비교
if normal_time>recursion_time:
    print("\n>> 재귀함수를 이용할 때가 일반함수를 이용할 때보다 {}만큼 빠르다." .format(normal_time-recursion_time))
else:
    print("\n>> 일반함수를 이용할 때가 재귀함수를 이용할 때보다 {}만큼 빠르다." .format(recursion_time-normal_time))




