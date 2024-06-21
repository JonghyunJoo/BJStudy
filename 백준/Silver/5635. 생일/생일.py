import datetime

n = int(input())

students = []
for _ in range(n):
    data = input().strip().split()
    name = data[0]
    day, month, year = map(int, data[1:])

    birthday = datetime.date(year, month, day)

    students.append((name, birthday))

students.sort(key=lambda student: student[1])

print(students[-1][0])
print(students[0][0])
