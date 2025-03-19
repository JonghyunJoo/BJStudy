def solution(schedules, timelogs, startday):
    answer = 0
    for i in range(len(schedules)):
        day = startday
        event = True
        for timelog in timelogs[i]:
            if day == 6:
                day += 1
                continue
            elif day == 7:
                day = 1
                continue
            if to_minute(schedules[i]) + 10 < to_minute(timelog):
                event = False
                break
            day += 1
        if event:
            answer += 1
    return answer

def to_minute(time):
    return time//100 * 60 + time % 100