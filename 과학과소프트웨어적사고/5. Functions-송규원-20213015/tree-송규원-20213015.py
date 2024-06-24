import turtle

s=turtle.Screen()
t=turtle.Turtle()

angle=30

def drawTree(t, lineLength):

    if lineLength>0 :

        t.forward(lineLength)
        t.left(angle)
        drawTree(t, lineLength-10)

        t.right(angle)
        t.right(angle)
        drawTree(t, lineLength-10)

        t.left(angle)
        t.backward(lineLength)

if __name__=="__main__":
    lineLength=60
    t.left(90)
    drawTree(t, lineLength)
