def hanoi_1(x, y, z, w):

    while x > 1 :
        print("%d : %c -> %c" %(x+1, y, z))
        x = x-1
        hanoi_1(x, y, z, w)
        
        
class Hanoi:
    
    def hanoi (self, n, start, mid, end):

        self.n = n
        self.start = start
        self.mid = mid
        self.end = end
        
        if  n == 1:
            print("%d : %c -> %c" %(n, start, end))
        else:
            a=hanoi_1(n-1, start, end, mid)

#main        
if __name__ == '__main__':
    m=int(input(">> m값 입력:"))
    
    h = Hanoi()
    h.hanoi(m, 'A', 'B', 'C')

