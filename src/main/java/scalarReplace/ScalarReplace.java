package scalarReplace;

/**
 * @ClassName
 * @Description 默认是开启逃逸分析的，优化之一的是标量替换，是否将一个类（未发生过逃逸分析的类）变成标量（基础数据类型）
 *
 * -XX:-EliminateAllocations 关闭标量分析
 *
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ScalarReplace {
    public static class User{
        private int id;
        private String name;
    }

    public static void alloc(){
        User u = new User();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0;i < 1000000;i++){
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为:" + (end - start) + "毫秒");
    }
}
