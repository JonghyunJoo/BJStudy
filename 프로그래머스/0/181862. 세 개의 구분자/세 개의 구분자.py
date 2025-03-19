def solution(myStr):
    myStr = myStr.replace('b', 'a').replace('c','a')
    answer = [s for s in myStr.split('a') if s]
    
    return answer if answer else ["EMPTY"]