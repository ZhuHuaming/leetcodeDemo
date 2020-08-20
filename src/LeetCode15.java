import java.util.*;

/**
 * @Author Administrator
 * @Date 2020/8/10 13:57
 * Desc:LeetCode 三数之和
 */
public class LeetCode15 {
    public static void main(String[] args) {
        threeSum(new int[]{-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0});
    }

    //方法一：暴力破解
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> threeSumList = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int num1 = nums[i];
            for (int j = i + 1; j < nums.length - 1; j++) {
                int num2 = nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    int num3 = nums[k];
                    if (num1 + num2 + num3 == 0) {
                        boolean isAdd = true;
                        List addListTemp = Arrays.asList(num1, num2, num3);
                        Collections.reverse(addListTemp);
                        addListTemp.toString();
                        String s1 = "" + addListTemp.get(0) + addListTemp.get(1) + addListTemp.get(2);
                        for (List<Integer> listInteger :
                                threeSumList) {
                            //如果这个组合已经在数组中存在
                            Collections.reverse(listInteger);
                            String s2 = "" + listInteger.get(0) + listInteger.get(1) + listInteger.get(2);
                            if (s1.equals(s2)) {
                                isAdd = false;
                            }
                        }
                        if (isAdd)
                            threeSumList.add(Arrays.asList(num1, num2, num3));
                    }
                }
            }
        }
        return threeSumList;
    }
}
