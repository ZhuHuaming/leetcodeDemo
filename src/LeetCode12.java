import java.util.HashMap;
import java.util.Map;

/**
 * 12. 整数转罗马数字
 * <p>
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 */
public class LeetCode12 {

    public static void main(String[] args) {
        int num = 1994;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num) {
        /*Map<Integer, String> romanNumberMap = new HashMap<>();
        romanNumberMap.put(1, "I");
        romanNumberMap.put(5, "V");
        romanNumberMap.put(10, "X");
        romanNumberMap.put(50, "L");
        romanNumberMap.put(100, "C");
        romanNumberMap.put(500, "D");
        romanNumberMap.put(1000, "M");*/
        String romanString = "";
        int countM = num / 1000;
        if (countM != 0) {
            for (int i = 0; i < countM; i++) {
                romanString += "M";
            }
        }
        num -= countM * 1000;
        if (num >= 900) {
            num -= 900;
            romanString += "CM";
        }
        if (num < 900 && num >=500) {
            num -= 500;
            romanString += "D";
        }
        if (num < 500 && num >= 400) {
            num -= 400;
            romanString += "CD";
        }
        if (num < 400) {
            int countC=num/100;
            for (int i = 0; i < countC; i++) {
                romanString += "C";
            }
            num-=countC*100;
        }
        if(num<100&&num>=90){
            num -=90;
            romanString+="XC";
        }
        if(num>=50){
            num -=50;
            romanString+="L";
        }
        if(num>=40){
            num -=40;
            romanString+="XL";
        }
        int countX=num/10;
        for (int i = 0; i < countX; i++) {
            romanString += "X";
        }
        num-=countX*10;
        if(num==9){
            romanString+="IX";
            num-=9;
        }
        if(num<9&&num>=5){
            num-=5;
            romanString+="V";
        }
        if(num==4){
            num-=4;
            romanString+="IV";
        }
        for (int i = 0; i < num; i++) {
            romanString += "I";
        }


        return romanString;
    }
}
