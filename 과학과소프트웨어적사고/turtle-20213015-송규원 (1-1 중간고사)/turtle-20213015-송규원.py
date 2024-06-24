#1. n의 값 입력 받는 함수
def main():

    print("다각형을 생성하고자 한다.")
    n=int(input(">> 각의 수 n을 입력하시오. (3<=n<=10):"))
    print("   입력하신 값은 {} 입니다.".format(n))

    if n<3 or n>10:
        n=int(input("\n>> 입력한 값 {}이(가) 3<=n<=10 범위를 벗어납니다. 다시 입력해 주세요:".format(n)))

    return n;

#2. 내각의 합 구하는 함수
def sum_of_internal_angle():

    internal_angle_sum=180*(a-2)

    return internal_angle_sum;

#3. 내각 구하는 함수
def finding_internal_angle():
    
    import random

    internal_angle=random.sample(range(1, 360), a)
    internal_angle.sort() 
    tuple(internal_angle)

    return internal_angle;

#4. 삼각형 판별 함수
def triangle():
    print("\n>> 입력된 삼각형의 타입을 출력합니다.")
    
    if c[0]+c[1]>c[2]:
        print(">> 예각 삼각형입니다.")
    elif c[0]+c[1]<c[2]:
        print(">> 둔각 삼각형입니다.")
    elif c[0]+c[1]==c[2]:
        print(">> 직각 삼각형입니다.")

#6. n각형 그림 그리는 함수
def drowing(a):
    
    import turtle
    
    t=turtle.Turtle()
    for i in range(a):
        
        t.fd(100)
        t.right(360/a)
    
#main    
#1. n값 입력받기
a=main()
print("   n=",a)

#2. 내각의 합 구하기
b=sum_of_internal_angle()
print("\n>> {}각형의 내각의 합은 {}도 입니다.".format(a,b))

#3. 내각 구하기
c=finding_internal_angle()
print("\n>> Random으로 생성된 {}각형의 내각값 (tuple):".format(a),end='')
print(c)

#4. n이 3이라면?
if a==3:
    f=triangle()

#6. 정n각형 그리기
d=drowing(a)

print("\n\n-END-")
