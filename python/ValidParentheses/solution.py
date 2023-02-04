class Solution:
    def isValid(self, s: str) -> bool:
        c = []
        dict = {
            ')': '(',
            '}': '{',
            ']': '['
        }
        valid = False
        for i, value in enumerate(s):
            if i == len(s)-1:
                if value == '(' or value == '{' or value == '[':
                    return False
            if c != []:
                if value == ')' or value == '}' or value == ']':
                    if c.pop() == dict.get(value):
                        if c != []:
                            valid = False
                        else:
                            valid = True
                    else:
                        return False
            elif c == [] and (value == ')' or value == '}' or value == ']'):
                return False
            
            if value == '(' or value == '{' or value == '[':
                c.append(value)
        return valid

Sol = Solution
print(Sol.isValid(Sol, "({})"))
#(){}}{ OK
#({{{{}}})) OK
#)(){} OK
#([] OK
