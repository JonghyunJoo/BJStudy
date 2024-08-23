def mod_exp(A, B, C):
    if B == 0:
        return 1
    elif B % 2 == 0:
        half = mod_exp(A, B // 2, C)
        return (half * half) % C
    else:
        return (A * mod_exp(A, B - 1, C)) % C

A, B, C = map(int, input().split())

print(mod_exp(A, B, C))
