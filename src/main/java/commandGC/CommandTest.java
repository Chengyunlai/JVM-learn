package commandGC;

/**
 * @ClassName
 * @Description 测试堆空间常用的jvm参数
 *
 * https://cloud.tencent.com/developer/article/1198524#:~:text=%E5%B8%B8%E7%94%A8%E7%9A%84JVM%E8%B0%83%E4%BC%98%E5%8F%82%E6%95%B0%E6%80%BB%E7%BB%93%E6%B1%87%E6%80%BB%E3%80%90%E9%9A%8F%E6%97%B6%E6%9F%A5%E9%98%85%E5%AD%A6%E4%B9%A0%E3%80%91%201%20%EF%BC%881%EF%BC%89-Xms20M%20%E8%A1%A8%E7%A4%BA%E8%AE%BE%E7%BD%AEJVM%E5%90%AF%E5%8A%A8%E5%86%85%E5%AD%98%E7%9A%84%E6%9C%80%E5%B0%8F%E5%80%BC%E4%B8%BA20M%EF%BC%8C%E5%BF%85%E9%A1%BB%E4%BB%A5M%E4%B8%BA%E5%8D%95%E4%BD%8D%202%20%EF%BC%882%EF%BC%89-Xmx20M%20%E8%A1%A8%E7%A4%BA%E8%AE%BE%E7%BD%AEJVM%E5%90%AF%E5%8A%A8%E5%86%85%E5%AD%98%E7%9A%84%E6%9C%80%E5%A4%A7%E5%80%BC%E4%B8%BA20M%EF%BC%8C%E5%BF%85%E9%A1%BB%E4%BB%A5M%E4%B8%BA%E5%8D%95%E4%BD%8D%E3%80%82%20%E5%B0%86-Xmx%E5%92%8C-Xms%E8%AE%BE%E7%BD%AE%E4%B8%BA%E4%B8%80%E6%A0%B7%E5%8F%AF%E4%BB%A5%E9%81%BF%E5%85%8DJVM%E5%86%85%E5%AD%98%E8%87%AA%E5%8A%A8%E6%89%A9%E5%B1%95%E3%80%82,%E8%A1%A8%E7%A4%BAJVM%E5%88%9D%E5%A7%8B%E5%88%86%E9%85%8D%E7%9A%84%E6%B0%B8%E4%B9%85%E4%BB%A3%EF%BC%88%E6%96%B9%E6%B3%95%E5%8C%BA%EF%BC%89%E7%9A%84%E5%AE%B9%E9%87%8F%EF%BC%8C%E5%BF%85%E9%A1%BB%E4%BB%A5M%E4%B8%BA%E5%8D%95%E4%BD%8D%207%20%EF%BC%887%EF%BC%89-XX%3AMaxPermSize%3D10M%20%E8%A1%A8%E7%A4%BAJVM%E5%85%81%E8%AE%B8%E5%88%86%E9%85%8D%E7%9A%84%E6%B0%B8%E4%B9%85%E4%BB%A3%EF%BC%88%E6%96%B9%E6%B3%95%E5%8C%BA%EF%BC%89%E7%9A%84%E6%9C%80%E5%A4%A7%E5%AE%B9%E9%87%8F%EF%BC%8C%E5%BF%85%E9%A1%BB%E4%BB%A5M%E4%B8%BA%E5%8D%95%E4%BD%8D%EF%BC%8C%E5%A4%A7%E9%83%A8%E5%88%86%E6%83%85%E5%86%B5%E4%B8%8B%E8%BF%99%E4%B8%AA%E5%8F%82%E6%95%B0%E9%BB%98%E8%AE%A4%E4%B8%BA64M%208%20%EF%BC%888%EF%BC%89-Xnoclassgc%20%E8%A1%A8%E7%A4%BA%E5%85%B3%E9%97%ADJVM%E5%AF%B9%E7%B1%BB%E7%9A%84%E5%9E%83%E5%9C%BE%E5%9B%9E%E6%94%B6%20%E6%9B%B4%E5%A4%9A%E9%A1%B9%E7%9B%AE
 *
 * -XX:+PrintFlagsInitial  //查看所有的参数的默认初始值
 * -XX:+PrintFlagsFinal  //查看所有的参数的最终值（可能会存在修改，不再是初始值）
 * -Xms20M  //初始堆空间内存（默认为物理内存的1/64）
 * -Xmx20M  //最大堆空间内存（默认为物理内存的1/4）
 * -Xmn  //设置新生代的大小。（初始值及最大值）
 * -Xss128k //表示可以设置虚拟机栈的大小为128k
 * -XX:NewRatio  //配置新生代与老年代在堆结构的占比；例如NewRatio=2，2是指老年
 * -XX:SurvivorRatio  //设置新生代中Eden和S0/S1空间的比例
 * -XX:MaxTenuringThreshold  //设置新生代垃圾的最大年龄
 * -XX:+PrintGCDetails //输出详细的GC处理日志
 * //打印gc简要信息：①-Xx：+PrintGC ② - verbose:gc
 * -XX:HandlePromotionFalilure：//是否设置空间分配担保
 *
 * 具体查看某个参数指令
 * 1. 先用jps查看进程的id
 * 2. jinfo -flag [查询的参数，例如survivorRation] 进程id
 *
 * @Author:chengyunlai
 * @Date 
 * @Version 1.0
 **/
public class CommandTest {
}
