class Solution:
    def numberOfSteps(self, num: int) -> int:
      steps = 0
      tmp = num
      while tmp > 0:
        steps += 1
        if tmp % 2 == 0:
          tmp /= 2
        else:
          tmp -= 1
        
      return steps  
  

# Caso de prueba: 
steps = Solution

numStpes = steps.numberOfSteps(steps,14)
print(numStpes)
