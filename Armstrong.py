x=int(input("Enter the number"))
c=0
s=0
x1=x
x2=x
while(x>0):
    c=c+1
    x=x%10
while(x1>0):
    r=x1%10
    p=r*r*r
    s=s+p
    x1=x1//10
if(x2==s):
    print("Armstrong number")
else:
    print("Not Armstrong number")
    
    
