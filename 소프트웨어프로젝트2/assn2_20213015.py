import time
import random


def seqsearch(nbrs, target):
    for i in range(0, len(nbrs)):
        if (target == nbrs[i]):
            return i
    return -1


def recbinsearch(L, l, u, target):
    if l >= u:
        return -1
    m = (l + u) // 2

    #중간 인덱스 값이 target과 같다면, 중간 인덱스 값 반환
    if L[m] == target:
        return L[m]

    #중간 인덱스 값이 target보다 크다면,
    elif L[m] > target:
        return recbinsearch(L, l, m-1, target) #upper >> m-1

    # 중간 인덱스 값이 target보다 작다면,
    else:
        return recbinsearch(L, m+1, u, target) #lower >> m+1


numofnbrs = int(input("Enter a number: "))
numbers = []
for i in range(numofnbrs):
    numbers += [random.randint(0, 999999)]

numbers = sorted(numbers)

numoftargets = int(input("Enter the number of targets: "))
targets = []
for i in range(numoftargets):
    targets += [random.randint(0, 999999)]


ts = time.time()

# binary search - recursive
cnt = 0
for target in targets:
    idx = recbinsearch(numbers, 0, len(numbers), target)
    if idx == -1:
        cnt += 1
ts = time.time() - ts
print("recbinsearch %d: not found %d time %.6f" % (numoftargets, cnt, ts))

ts = time.time()

# sequential search
cnt = 0
for target in targets:
    idx = seqsearch(numbers, target)
    if idx == -1:
        cnt += 1
ts = time.time() - ts
print("seqsearch %d: not found %d time %.6f" % (numoftargets, cnt, ts))