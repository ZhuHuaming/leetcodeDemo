/**
 * @Author Administrator
 * @Date 2020/8/10 16:19
 * Desc:ZJ1 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class JZOffer1 {

    public static void main(String[] args) {

        System.out.println(Find(8, new int[][]{
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {8, 9, 10, 11}
        }));
    }

    /** 主要就是一个查找的问题，可以考虑从左下角开始查找，然后根据表原本的有序性，进行位置的变换*/
    public static boolean Find(int target, int[][] array) {
        //行长度
        int rowlength = array.length;
        //列长度
        int colength = array[0].length;
        int x = 0;
        int y = colength - 1;
        while (x < rowlength && y > 0) {
            if (array[x][y] == target) {
                return true;
            } else if (array[x][y] < target) {
                x++;

            } else if (array[x][y] > target) {
                y--;
            }
        }
        return false;
    }
}
