import java.util.ArrayList;
import java.util.List;

/**
 * @Author Administrator
 * @Date 2020/9/17 17:45
 * Desc:剑指 Offer 14- I. 剪绳子
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * <p>
 * 示例 1：
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jian-sheng-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class JZOffer14 {
    public static void main(String[] args) {


    }

    public int cuttingRope(int n) {

        int[] lengths = new int[n];
        return getMax(n,lengths);

    }


    public int getMax(int n,int[] lengths) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int max = 0;
        for (int i = 1; i < n - 1; i++) {
            max = Math.max(max, i * getMax(n - i));
        }
        return max;
    }
}
