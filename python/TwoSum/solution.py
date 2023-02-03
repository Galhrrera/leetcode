from ast import List


class Solution:
    def twoSum(self, nums, target) -> List[int]:
        '''
        Creo un diccionario.
        En python un diccionario es una analogía con un mapa de java (estructura de clave - valor)
        '''
        map = {}
        
        # Se itera sobre el arreglo, por lo que el número de iteraciones será la longitud del arreglo
        for i in range(len(nums)):
            '''
            Target es el número que espero encontrar sumando 2 elementos del arreglo.
            
            Target - nums [i] in map. Quiere decir que:
                Si target se puede expresar como la suma de 2 elementos del arreglo, si a target le resto un elemento del arreglo, el otro elemento con el que se 
                debe sumar el primero, también debe estar en el arreglo.
                
                entonces
                
                
                elemento1 + elemento 2 = target
                elemento1 = target - elemento2
                
                Estoy despejando uno de los elementos.
            '''
            if target - nums[i] in map:
                
                '''
                El retorno es en formato: [x,y]
                
                Si se cumplen las condiciones, se retorna: [El índice en el que se encuentra: elemento1 = target - elemento2, 
                índice del arreglo en el que se encuentra el elemento2]
                '''
                return [map[target-nums[i]],i]
            
            #Se actualiza el map
            map[nums[i]] = i
            
        #Si no se cumple la condición del for, se retorna vacío, ya que no hay una soliución
        return []

        # Caso de prueba:

nums = [2,7,11,15]
target = 9

Solution = Solution

print(Solution.twoSum(nums=nums, target=target, self=Solution))

