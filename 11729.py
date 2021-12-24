n = int(input())

a = [i for i in range(n, 0, -1)];
b = [];
c = [];

def hanoi(n, start, to, via):
    if n == 1:
        print(start, to)
        return
    else:
        hanoi(n-1, start, via, to)
        print(start, to)
        hanoi(n-1, via, to, start)
        
hanoi(n, "1", "3", "2")