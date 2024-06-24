import turtle

s = turtle.Screen()
t = turtle.Turtle()

angle = 30

def tree_1(c, d):

    if d > 0:
        t.forward(d)
        t.left(angle)
        tree_1(c, d-10)

        t.right(angle)
        t.right(angle)
        tree_1(c, d-10)

        t.left(angle)
        t.backward(d)

        d = d-10
    return 
    
class Tree:
    
    def drawTree(self, t, lineLength):

        self.t = t
        self.lineLength = lineLength

        if lineLength > 0:

            b = tree_1(t, lineLength)


if __name__ == "__main__":
    lineLength=60
    t.left(90)

    a = Tree()
    a.drawTree(t, lineLength)
