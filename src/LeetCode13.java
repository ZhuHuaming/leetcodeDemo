import java.util.HashMap;
import java.util.Map;

/**
 * 整数转罗马数
 * * I             1
 * * V             5
 * * X             10
 * * L             50
 * * C             100
 * * D             500
 * * M             1000
 * * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 */
public class LeetCode13 {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {
        Map<String, Integer> romanNumberMap = new HashMap<>();
        romanNumberMap.put("I", 1);
        romanNumberMap.put("V", 5);
        romanNumberMap.put("X", 10);
        romanNumberMap.put("L", 50);
        romanNumberMap.put("C", 100);
        romanNumberMap.put("D", 500);
        romanNumberMap.put("M", 1000);
        romanNumberMap.put("IV", 4);
        romanNumberMap.put("IX", 9);
        romanNumberMap.put("XL", 40);
        romanNumberMap.put("XC", 90);
        romanNumberMap.put("CD", 400);
        romanNumberMap.put("CM", 900);
        int num = 0;
        char[] roman = s.toCharArray();
        int i = 0;
        while ( i <roman.length ) {
            if (i==roman.length-1){
                num+=romanNumberMap.get(roman[i]+"");
                i++;
            }else{
                if(romanNumberMap.get(roman[i]+"")<romanNumberMap.get(roman[i+1]+"")){
                    num+=romanNumberMap.get(roman[i]+""+roman[i+1]+"");
                    i+=2;
                }else{
                    num+=romanNumberMap.get(roman[i]+"");
                    i++;
                }
            }

        }

        return num;
    }
}
