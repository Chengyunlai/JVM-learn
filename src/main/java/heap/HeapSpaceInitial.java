package heap;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName
 * @Description
 *
 * 1. 设置堆空间大小的参数
 * -XmsSize 用来设置堆空间（年轻代 + 老年代）的初始内存大小
 * -X 是jvm的运行参数
 * ms 是memory start 缩写
 * Size 指定大小
 *
 * -Xmx 用来设置堆空间（年轻代 + 老年代）的最大内存大小
 *
 *
 * 2. 默认堆空间的大小
 * ● 初始内存大小：物理电脑内存大小 / 64
 * ● 最大内存大小：物理电脑内存大小 / 4
 *
 * 3. 手动设置 : -Xms100M -Xmx100M
 *  开发中建议将初始堆内存和最大堆内存设置成一样大的
 *
 * 4. 查看设置的参数：
 *  方式一： jsp 查看启动的进程
 *          jstat -gc 进程id
 *
 *  方式二： -XX:+PrintGCDetails
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class HeapSpaceInitial {
    public static void main(String[] args) {
        // 返回Java虚拟机中的堆内存总量
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;

        // 返回Java虚拟机试图使用的最大堆内存
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 /1024;

        System.out.println("-Xms:" + initialMemory + "M");
        System.out.println("-Xmx:" + maxMemory + "M");

        // 不指定堆内存时，可以打开此注释，看大致内存大小
        // System.out.println("系统内存大小为:" + initialMemory * 64.0 / 1024 + "G");
        // System.out.println("系统内存大小为:" + maxMemory * 4.0 / 1024 + "G");

        // try {
        //     TimeUnit.SECONDS.sleep(100);
        // } catch (InterruptedException e) {
        //     throw new RuntimeException(e);
        // }
    }
}
