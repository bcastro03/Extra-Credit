class FiboNum:
    @staticmethod
    def fib(n):
        a, b = 0, 1
        if n == 0:
            return a
        for i in range(2, n + 1):
            c = a + b
            a = b
            b = c
        return b

if __name__ == "__main__":
    n = 2
    print(FiboNum.fib(n))