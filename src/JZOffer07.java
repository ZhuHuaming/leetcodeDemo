import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Administrator
 * @Date 2020/9/17 15:08
 * Desc:输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class JZOffer07 {


    public static void main(String[] args) {

        buildTree(new int[]{3, 9, 20, 15, 17}, new int[]{9, 3, 15, 20, 7});
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        int length = preorder.length;
        for (int i = 0; i < length; i++) {
            indexMap.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, length - 1, inorder, 0, length - 1, indexMap);
        return root;
    }


    //拆分二叉树
    public static TreeNode buildTree(int[] preorder, int preorderStart, int preorderEnd, int[] inorder, int inorderStart, int inorderEnd, Map<Integer, Integer> indexMap) {
        if(preorderStart>preorderEnd){
            return null;
        }

        int rooval = preorder[preorderStart];
        TreeNode root =new TreeNode(rooval);
        if(preorderStart == preorderEnd){
            return root;
        }else{
            int rootIndex =indexMap.get(rooval);
            int leftNodes =rootIndex-inorderStart,rightNodes =inorderEnd-rootIndex;
            root.right = buildTree(preorder, preorderEnd - rightNodes + 1, preorderEnd, inorder, rootIndex + 1, inorderEnd, indexMap);

            root.left =buildTree(preorder,preorderStart+1,preorderStart+leftNodes,inorder,inorderStart,rootIndex-1,indexMap);

            return root;
        }

    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
