import random #랜덤모듈 

lotto_numbers=random.sample(range(1, 45), 5) #sample 함수를 이용하여 중복 제거
lotto_numbers.sort() #sort를 이용하여 정렬
print(lotto_numbers) #출력
