T = int(input())

for _ in range(T):
    N = int(input())
    credit = 0
    grade_sum = 0
    for _ in range(N):
        C, G = input().split()
        credit += int(C)
        grade_sum += float(G) * float(C)
    GPA = round(grade_sum / credit, 1)
    print(f"{credit} {GPA}")
