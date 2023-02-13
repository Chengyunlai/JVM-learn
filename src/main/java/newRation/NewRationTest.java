package newRation;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName
 * @Description  设置堆空间中新生代和老年代的大小比例
 *
 * 先用 -Xms 和 -Xmx 指定堆空间的大小
 * 再用 -NewRation=多少 指定新生代和老年代的比例。默认是1:2
 *
 * 例如 -XX:NewRation=2，表示新生代占1，老年代占2，新生代占整个堆的1/3
 *
 * 调整比例，生命周期很长的对象很多，那就把old区变大，反之old区比例小
 *
 * cmd代码：jinfo -flag NewRation 进程号：看这个进程号设置的NewRation
 *
 * 另外在新生代中又分为Eden空间和另外两个Survivor空间缺省所占的比例是8:1:1；但是JVM是有一个自适应机制的，这个自适应机制可能导致比例并不是8:1:1，可以将自适应这个配置关闭-XX:-UseAdaptiveSizePolicy，然后再搭配显示指定 -XX:SurvivorRatio=8
 *
 * 可以通过选项 -XX:SurvivorRatio 调整这个空间比例，例如-XX:SurvivorRatio=8
 *
 * cmd代码：jinfo -flag SurvivorRatio 进程号：看这个进程号设置的SurvivorRatio
 *
 * -Xmn:设置新生代的大小（会比设置比例的优先级要高，一般不使用）
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class NewRationTest {
    public static void main(String[] args) {
        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
