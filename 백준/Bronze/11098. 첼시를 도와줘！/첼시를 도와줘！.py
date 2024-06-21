n = int(input())

for _ in range(n):
    p = int(input())
    max_price = -1
    max_player = ""

    for _ in range(p):
        C, name = input().split()
        C = int(C)

        if C > max_price:
            max_price = C
            max_player = name

    print(max_player)
