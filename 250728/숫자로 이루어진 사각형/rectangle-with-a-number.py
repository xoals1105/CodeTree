n = int(input())


def answer(n):
    num = 1
    for i in range(n):
        for j in range(n):
            print(num, end=' ')
            num = num + 1
            if num > 9:
                num = 1
        print()
        
answer(n)