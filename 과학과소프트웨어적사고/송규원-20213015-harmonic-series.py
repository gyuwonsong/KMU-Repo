import math

k=int(input("k의 값 (범위):"))

a=int()
b=int()


for a in range (1,k):
    b += 1/a
    c = math.log10(k)

print ("오차율 :", (c-b)/b)
