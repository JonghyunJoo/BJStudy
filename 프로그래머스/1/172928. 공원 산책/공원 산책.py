def solution(park, routes):
    H, W = len(park), len(park[0])
    start_x, start_y = -1, -1
    
    for i in range(H):
        for j in range(W):
            if park[i][j] == 'S':
                start_x, start_y = i, j
                break
        if start_x != -1:
            break
    
    direction = {
        'N': (-1, 0),
        'S': (1, 0),
        'W': (0, -1),
        'E': (0, 1)
    }
    
    x, y = start_x, start_y
    for route in routes:
        direction_str, n = route.split()
        n = int(n)
        
        dx, dy = direction[direction_str] 
        
        can_move = True
        nx, ny = x, y
        for _ in range(n):
            nx, ny = nx + dx, ny + dy 
            
            if nx < 0 or nx >= H or ny < 0 or ny >= W:
                can_move = False
                break
            
            if park[nx][ny] == 'X':
                can_move = False
                break

        if can_move:
            x, y = nx, ny
    
    return [x, y]
