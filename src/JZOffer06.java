import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @Author Administrator
 * @Date 2020/9/17 14:57
 * Desc:链表从尾到头读取
 */
public class JZOffer06 {


    //使用栈结构，读取一遍，再出栈
    public int[] reversePrint(ListNode head) {

        Stack<ListNode> stack = new Stack<>();
        ListNode nodeTemp = head;
        while (nodeTemp != null) {
            stack.push(nodeTemp);
            nodeTemp = nodeTemp.next;
        }

        int size =stack.size();

        int[] printer = new int[size];
        for (int i = 0; i < size; i++) {
            printer[i] =stack.pop().val;
        }

        return printer;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
