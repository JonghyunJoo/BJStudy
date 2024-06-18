N = int(input())

c_count = 0
nc_count = 0

for i in range(N):
    op = int(input())
    if op == 1:
        c_count += 1
    else:
        nc_count += 1

if c_count > nc_count:
    print("Junhee is cute!")

else:
    print("Junhee is not cute!")
