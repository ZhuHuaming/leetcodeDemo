/**
 * Z字变换
 */


public class LeetCode6 {

    public static void main(String[] args) {
        System.out.println(convert("AB", 1));
    }

    public static String convert(String s, int numRows) {

        char[] m = s.toCharArray();
        String outString = "";
        int group=1;
        //每一组数量
        if(numRows>1) {
             group= (2*numRows - 2);
        }
        //组数
        int groupNumbers = (int) Math.ceil((float) m.length / (2*numRows - 2));
        //先遍历每组
        for (int k = 0; k < numRows; k++) {
            for (int i = 0; i < groupNumbers; i++) {
                if ((k + i * (2*numRows - 2)) < m.length) {
                    if (k != 0 && k != numRows - 1) {
                        outString += m[k + i * (2*numRows - 2)];
                        int sameLineNumber = (2*numRows - 2) - k;
                        if (sameLineNumber + i * (2*numRows - 2) < m.length) {
                            outString += m[sameLineNumber + i * (2*numRows - 2)];
                        }
                    } else {
                        outString += m[k + i * (2*numRows - 2)];
                    }
                }
            }
        }
        return outString;
    }


}
