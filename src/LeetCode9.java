public class LeetCode9 {
     public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else if((LeetCode7.reverse(x)+x)==2*x){
            return true;
        }else{
            return false;
        }

    }
}
