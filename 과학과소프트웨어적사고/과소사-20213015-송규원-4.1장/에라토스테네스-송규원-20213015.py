n=int(input(">> n의 값 입력:"))
a = [False, False] + [True]*(n-1)


prime_number_list=[]

for i in range(2,n+1):
    if a[i]:
        prime_number_list.append(i)
        for j in range(2*i,n+1, i):
            a[j] = False
print(">> 에라토스테네스의 체를 이용한 %d 까지의 모든 소수:" %n, prime_number_list)
