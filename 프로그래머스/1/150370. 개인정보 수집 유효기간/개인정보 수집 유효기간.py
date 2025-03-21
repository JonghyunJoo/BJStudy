def solution(today, terms, privacies):
    t_year,t_month,t_day = list(map(int, today.split(".")))
    today = month_to_day(year_to_month(t_year) + t_month) + t_day
    
    term_dict = {key: int(value) for key, value in (term.split() for term in terms)}
    answer = []
    for i, privacy in enumerate(privacies):
        p_date, p_term = privacy.split()
        p_year, p_month, p_day = list(map(int, p_date.split(".")))
        p_date = month_to_day(year_to_month(p_year) + p_month + term_dict[p_term]) + p_day
        
        if p_date <= today:
            answer.append(i+1)
    
    return answer
def year_to_month(year):
    return year*12
def month_to_day(month):
    return month*28