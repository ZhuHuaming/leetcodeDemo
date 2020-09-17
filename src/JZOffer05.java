/**
 * @Author Administrator
 * @Date 2020/9/17 14:51
 * Desc:请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class JZOffer05 {


    //根据字节遍历
    public String replaceSpace(String s) {
        char[] chars = new char[s.length() * 3];

        int size = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                chars[size++] = '%';
                chars[size++] = '2';
                chars[size++] = '0';

            } else {
                chars[size++] = s.charAt(i);
            }
        }


        return new String(chars, 0, size);

    }

}
