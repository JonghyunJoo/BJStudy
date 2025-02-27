def solution(array, commands):
    answer = []
    for command in commands:
        sliced_array = array[command[0]-1:command[1]]
        sliced_array.sort()
        answer.append(sliced_array[command[2]-1])
    return answer