n = int(input("Enter the number : "))
c=0

for i in range(1,n+1):
    if(n%i==0):
        c=c+1
if(c==2):
    print(str(n)+" is prime number ")
else:
    print(str(n)+" is not prime")
