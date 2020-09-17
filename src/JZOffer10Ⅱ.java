/**
 * @Author Administrator
 * @Date 2020/9/17 16:23
 * Desc:一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */
public class JZOffer10Ⅱ {
    /**
     * 和11题思路一样
     * @param n
     * @return
     */
    public int numWays(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int now = 2, first = 1, second = 2;
        for (int i = 2; i < n; i++) {
            now = (first + second) % 1000000007;
            first = second;
            second = now;

        }
        return now;
    }
}
