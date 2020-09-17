/**
 * @Author Administrator
 * @Date 2020/9/17 17:20
 * Desc:剑指 Offer 13. 机器人的运动范围
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class JZOffer13 {
    public int movingCount(int m, int n, int k) {
        int[][] temp = new int[m][n];
        canMove(0, 0, m, n, k, temp);
        int nums = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                if (temp[i][j] == 1) {
                    nums++;
                }
            }
        }
        return nums;

    }

    //可以有优化为向下向右
    public void canMove(int x, int y, int m, int n, int k, int[][] temp) {
        if (x >= m || y >= n || x < 0 || y < 0 || (sumDig(x) + sumDig(y)) > k || temp[x][y] == 1) return;
        temp[x][y] = 1;
        canMove(x, y + 1, m, n, k, temp);
        canMove(x, y - 1, m, n, k, temp);
        canMove(x + 1, y, m, n, k, temp);
        canMove(x - 1, y, m, n, k, temp);
    }

    public static int sumDig(int n) {
        int sum = 0;
        if (n >= 10) {
            sum += n % 10;
            sum += sumDig(n / 10);
        } else
            sum += n;
        return sum;
    }
}
