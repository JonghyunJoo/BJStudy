n = int(input())

fibonacci = 0
prev2 = 0
prev1 = 1

if n==0:
    print(0)
elif n==1:
    print(1)
else:
    for _ in range(2, n+1):
        fibonacci = prev1 + prev2
        prev2 = prev1
        prev1 = fibonacci
    print(fibonacci)
