package vmStack;

/**
 * @ClassName
 * @Description 设置栈的大小 -Xss256k
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class StackErrorTest {
    private static int count = 1;
    public static void main(String[] args) {
        System.out.println(count++);
        main(args);
    }
}
