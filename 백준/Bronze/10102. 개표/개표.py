V = int(input().strip())
votes = input().strip() 

count_A = 0
count_B = 0

for vote in votes:
    if vote == 'A':
        count_A += 1
    elif vote == 'B':
        count_B += 1

if count_A > count_B:
    print('A')
elif count_B > count_A:
    print('B')
else:
    print('Tie')
