class Solution:
    def isPalindrome(self, x: int) -> bool:
        string = str(x)
        if string[0] == '-':
            return False
        invertedNum = int(string[::-1])
        if x == invertedNum:
            return True
        else:
            return False
        
Solution = Solution
x = 121
print(Solution.isPalindrome(Solution, x=x))