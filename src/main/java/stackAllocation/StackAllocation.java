package stackAllocation;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName
 * @Description 测试是否逃逸分析的堆分配情况
 * 开启逃逸分析后是 9毫秒
 * -XX:-DoEscapeAnalysis 默认是开启的。关闭逃逸分析；116毫秒
 *
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class StackAllocation {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0;i < 10000000; i++){
            alloc();
        }

        long end = System.currentTimeMillis();
        System.out.println("花费的时间是:" + (end- start) + "毫秒");

        try {
            TimeUnit.SECONDS.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void alloc(){
        StackAllocation stackAllocation  = new StackAllocation();
    }
}
