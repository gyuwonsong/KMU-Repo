import time

numbers_bubble=[]
numbers_sort=[]

n=int(input(">> 추가하길 원하는 버블정렬 list 갯수:"))
k=int(input(">> 추가하길 원하는 sort() 함수 list 갯수:"))

for i in range(1,n+1):
    a=int(input(">> 버블정렬 list목록 입력:"))
    numbers_bubble.append(a)

for j in range(1,k+1):
    b=int(input(">> sort() 함수 이용 list목록 입력:"))
    numbers_sort.append(b)

    
print(">> 버블정렬 list목록:", numbers_bubble)
print(">> sort() 함수 이용 list목록:", numbers_sort)

start_bubble=time.time()

#버블정렬
for j in range(len(numbers_bubble)-1):
    for i in range(len(numbers_bubble)-1-j):
        if numbers_bubble[i]>numbers_bubble[i+1]:
            a=numbers_bubble[i]
            numbers_bubble[i]=numbers_bubble[i+1]
            numbers_bubble[i+1]=a
            
print(">> 버블정렬 이용:" ,numbers_bubble)
print(">> 버블정렬 처리시간:" ,start_bubble)


#sort() 함수로 정렬
start_sort=time.time()
print("\n>> sort() 함수로 정렬 전:" ,numbers_sort)
numbers_sort.sort()
print(">> sort() 함수로 정렬 후:" ,numbers_sort)
print(">> sort() 함수 처리시간:" ,start_sort)


#버블정렬 사용과 sort() 함수 사용 시 처리시간 비교
print("\n>> 처리시간 비교: sort()함수가 버블정렬보다 {} 만큼 더 빠르다." .format(start_sort-start_bubble))
