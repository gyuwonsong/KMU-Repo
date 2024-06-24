class Vector2D:
    def __init__(self, x, y):
        self.x = x
        self.y = y
        print("\n>> init) self.x =", self.x, "self.y =", self.y)

    def __mul__(self, other):
        print("\n>> mul) self.x =", self.x, "self.y =", self.y)
        print(">> mul) other.x =", other.x, "other.y =", other.y)
        return Vector2D(self.x * other.x, self.y * other.y)

#main
print(">> 1) 객체 a 생성")
a = Vector2D(0,1)
print("\n>> print a =", a)

print(">> 2) 객체 b 생성")
b = Vector2D(1,0)
print("\n>> print b =", b)

print(">> 3) 객체 mul 생성, __mul__ 호출")
mul = a * b
print("\n>> print mul =", mul)



