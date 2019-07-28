public class Leetcode10 {
    public static void main(String[] args) {
        int[] heigth={1,8,6,2,5,4,8,3,7};
        //49
        System.out.println(maxArea(heigth));
    }

    public static int maxArea(int[] height){
        //暴力
        int max=0;
        for(int i=0;i<height.length-1;i++){
            for(int k=i+1;k<height.length;k++){
                max=Math.max((k-i)*Math.min(height[i],height[k]),max);
            }
        }
        return max;
        //双指针移动
       /* int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;*/

    }
}
