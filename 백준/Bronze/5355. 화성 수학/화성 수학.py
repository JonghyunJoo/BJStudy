T = int(input())
for i in range(T):
    list = input().split()
    num = float(list[0])
    for i in list:
        if i == "@":
            num *= 3
        elif i == "%":
            num += 5
        elif i == "#":
            num -= 7
    print(f"{num:.2f}")
