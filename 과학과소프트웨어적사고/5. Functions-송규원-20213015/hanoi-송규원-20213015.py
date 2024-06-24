def hanoi (n, start, mid, end):

    if n==1:
        print("%d : %c -> %c" %(n, start, end))
    else:
        hanoi(n-1, start, end, mid)
        print("%d : %c -> %c" %(n, start, end))
        hanoi(n-1, start, end, mid)

if __name__=='__main__':
    n=int(input(">> n값 입력:"))
    hanoi(n, 'A', 'B', 'C')
