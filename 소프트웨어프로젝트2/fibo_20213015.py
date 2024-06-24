import time

# 반복기법을 이용한 피보나치 수열
def iterfibo(n):
    a, b = 1, 1
    if n == 1 or n == 2:
        return 1
        
    for i in range(1, n):
        a, b = b, a+b

    return a

# 재귀함수를 이용한 피보나치 수열
def recurfibo(n):
    if n == 1 or n == 2:
        return 1
    else:
        return recurfibo(n-1)+recurfibo(n-2)
    

# main
n = int(input(">> n값 입력:"))

# 반복기법 사용시 시작 시간
iter_start = time.time()
c = iterfibo(n)

print("\n>> 반복기법을 이용한 {}값의 피보나치 수: {}" .format(n, c))
iter_time = time.time() - iter_start
print(">> 반복기법 이용시 걸린 시간:", iter_time)

# 재귀함수 사용시 시작 시간
recur_start = time.time()

print("\n>> 재귀함수를 이용한 {}값의 피보나치 수: {}" .format(n, recurfibo(n)))
recur_time = time.time() - recur_start
print(">> 재귀함수 이용시 걸린 시간:", recur_time)

# 처리시간 비교
if iter_time > recur_time:
    print("\n>> 재귀함수를 이용할 때가 일반함수를 이용할 때보다 {}만큼 빠르다." .format(iter_time - recur_time))
else:
    print("\n>> 반복기법을 이용할 때가 재귀함수를 이용할 때보다 {}만큼 빠르다." .format(recur_time - iter_time))



