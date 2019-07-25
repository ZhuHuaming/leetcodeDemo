import java.text.DecimalFormat;

public class LeetCode4 {
    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count = nums1.length + nums2.length;
        int flag1 = -1;
        int flag2 = -1;
        int number = -1;
        //是偶数
        if (count % 2 == 0) {
            while ((flag1 + flag2+2) < count / 2) {
                if (flag1 == (nums1.length - 1)) {
                    flag2++;
                    number = nums2[flag2];
                } else if (flag2 == (nums2.length - 1)) {
                    flag1++;
                    number = nums1[flag1];
                } else if (nums1[flag1 + 1] <= nums2[flag2 + 1]) {
                    flag1++;
                    number = nums1[flag1];
                } else if (nums1[flag1 + 1] > nums2[flag2 + 1]) {
                    flag2++;
                    number = nums2[flag2];
                }
            }
            float finalNumber=0;
            if (flag1+1 == nums1.length) {
                finalNumber=((float)number + nums2[flag2+1]) / 2;
            } else if (flag2+1 == nums2.length) {
                finalNumber= ((float)number + nums1[flag1+1]) / 2;
            } else if (nums1[flag1 + 1] <= nums2[flag2 + 1]) {
                finalNumber= ((float)number + nums1[flag1+1]) / 2;
            } else if (nums1[flag1 + 1] > nums2[flag2 + 1]) {
                finalNumber= (((float)number + (float)nums2[flag2+1]) / 2);
            }

            return finalNumber;

        } else if (count % 2 == 1) {
            while ((flag1 + flag2+2) <= count / 2) {
                if (flag1 == (nums1.length - 1)) {
                    flag2++;
                    number = nums2[flag2];
                } else if (flag2 == (nums2.length - 1)) {
                    flag1++;
                    number = nums1[flag1];
                } else if (nums1[flag1 + 1] <= nums2[flag2 + 1]) {
                    flag1++;
                    number = nums1[flag1];
                } else if (nums1[flag1 + 1] > nums2[flag2 + 1]) {
                    flag2++;
                    number = nums2[flag2];
                }
            }
        }
        return number;

    }
}
