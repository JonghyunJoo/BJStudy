current_time = input().strip()
start_time = input().strip()

current_h, current_m, current_s = map(int, current_time.split(':'))
start_h, start_m, start_s = map(int, start_time.split(':'))

current_seconds = current_h * 3600 + current_m * 60 + current_s
start_seconds = start_h * 3600 + start_m * 60 + start_s


if start_seconds >= current_seconds:
    remaining_seconds = start_seconds - current_seconds
else:
    remaining_seconds = (24 * 3600 - current_seconds) + start_seconds

remaining_h = remaining_seconds // 3600
remaining_m = (remaining_seconds % 3600) // 60
remaining_s = remaining_seconds % 60

print(f"{remaining_h:02}:{remaining_m:02}:{remaining_s:02}")