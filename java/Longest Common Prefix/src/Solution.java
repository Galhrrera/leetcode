import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        // Ordena el arrelo con la siguiente regla: palabras de menor longitud ->
        // palabras de mayor longitud
        Arrays.sort(strs, Comparator.comparingInt(String::length));

        // Selecciona la palabra de menor longitud
        char[] shortestStringCharArray = strs[0].toCharArray();
        boolean flag = false;

        if (strs.length == 1) {
            return strs[0];
        } else {
            String prefix = "";
            for (int i = 0; i < shortestStringCharArray.length; i++) {
                prefix += shortestStringCharArray[i];
                for (int j = 0; j < strs.length; j++) {
                    if (strs[j].startsWith(prefix)) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (!flag)
                    break;
            }

            String rtn = "";
            if (!flag) {
                for (int i = 0; i < prefix.length() - 1; i++) {
                    rtn += prefix.charAt(i);
                }
            }
            else{
                rtn =  prefix;
            }
            return rtn;
        }

    }

    //Caso de prueba
    public static void main(String[] args) throws Exception {

        String[] strs = { "ab", "a" };

        Solution sln = new Solution();
        System.out.println(sln.longestCommonPrefix(strs));
    }
}
