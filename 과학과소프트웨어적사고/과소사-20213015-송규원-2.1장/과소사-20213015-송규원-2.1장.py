Python 3.9.2 (tags/v3.9.2:1a79785, Feb 19 2021, 13:44:55) [MSC v.1928 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> import turtle
>>> 
>>> s=turtle.Screen()
>>> t=turtle.Turtle()
>>> 
>>> t.pensize(3)
>>> t.pendown()
>>> t.circle(100)

>>> x=-40
>>> y=120
>>> t.penup()
>>> t.goto(x,y)
>>> t.dot(25)
>>> 
>>> t.penup()
>>> t.goto(x+80,y)
>>> t.pendown()
>>> t.dot(25)
>>> 
>>> t.penup()
>>> t.goto(x-20,y-57)
>>> t.pendown()
>>> t.setheading(-60)
>>> t.circle(70,120)
>>> 