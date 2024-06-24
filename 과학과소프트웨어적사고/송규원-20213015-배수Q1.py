n=int(input(">> n="))
print("\n>> 입력한 n=", n)

sum_of_num=0
number=1
count=0

print(">> 0~100 사이의 %d의 배수 리스트 :" %n, end="")
while number<=100:

    if number%n==0:
        sum_of_num=sum_of_num+number
        count=count+1
        print(number," ",end="")

    number=number+1

print("\n>> 1~100 사이의 %d의 배수의 수 :" %n, count)
print("   1~100사이의 모든 %d의 배수의 합 :" %n, sum_of_num)
