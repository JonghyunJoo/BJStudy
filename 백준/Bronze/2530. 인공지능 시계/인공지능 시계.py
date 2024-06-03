A, B, C = map(int, input().split())
D = int(input())

total_seconds = 3600 * A + 60 * B + C + D

end_hour = (total_seconds // 3600) % 24
end_minute = (total_seconds % 3600) // 60
end_second = total_seconds % 60

print(f"{end_hour} {end_minute} {end_second}")
