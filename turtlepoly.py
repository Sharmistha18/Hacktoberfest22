
#polygon

import turtle
p = turtle.Turtle()
s = int(input("enter sides"))
l = int(input("Enetr side length"))
for i in range(s):
    p.forward(l)
    p.left(360/s)
turtle.done()

