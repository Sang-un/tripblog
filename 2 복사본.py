from collections import deque
n , m = map(int, input().split())
graph = []
for _ in range(n):
    graph.append(list(map(int, input())))

dx = [-1,1,0,0]
dy = [0,0,-1,1]

q = deque([(0,0)])
while q:
    now = q.popleft()
    cnt = graph[now[0]][now[1]]
    for i in range(4):
        nx = now[0] + dx[i]
        ny = now[1] + dy[i]
        if graph[nx][ny] != 0 and 0<= nx < n and 0 <= ny < m:
            graph[nx][ny] = cnt +1
print(graph)




