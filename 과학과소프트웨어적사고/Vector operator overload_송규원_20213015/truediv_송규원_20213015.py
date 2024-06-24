class Vector2D:
    def __init__(self, x, y):
        self.x = x
        self.y = y
        print("\n>> init) self.x =", self.x, "self.y =", self.y)

    def __truediv__(self, other):
        print("\n>> truediv) self.x =", self.x, "self.y =", self.y)
        print(">> truediv) other.x =", other.x, "other.y =", other.y)
        return Vector2D(self.x / other.x, self.y / other.y)

#main
print(">> 1) 객체 a 생성")
a = Vector2D(5,2)
print("\n>> print a =", a)

print(">> 2) 객체 b 생성")
b = Vector2D(2,5)
print("\n>> print b =", b)

print(">> 3) 객체 truediv 생성, __truediv__ 호출")
truediv = a / b
print("\n>> print truediv =", truediv)
