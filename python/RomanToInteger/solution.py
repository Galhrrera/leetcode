class Solution:
    def romanToInt(self, s: str) -> int:
        dict = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }
        number = 0
        i = 0
        while i < len(s):

            if i+1 < len(s):
                if dict.get(s[i]) < dict.get(s[i+1]):
                    mayor = dict.get(s[i+1])
                    menor = dict.get(s[i])
                    number += dict.get(s[i+1]) - dict.get(s[i])
                    i += 2
                    continue

            number += dict.get(s[i])
            i += 1
            
        return number
    
    
sol = Solution
print(sol.romanToInt(sol, "IV"))