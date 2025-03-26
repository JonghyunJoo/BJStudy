def solution(date1, date2):
    return 1 if date_to_day(date2)-date_to_day(date1) > 0 else 0

def date_to_day(date):
    return date[0]*28*12+date[1]*28+date[2]