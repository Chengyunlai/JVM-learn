package classLoader;

import sun.misc.Launcher;
import sun.security.util.CurveDB;

import java.net.URL;
import java.security.Provider;
import java.util.Properties;

/**
 * @ClassName
 * @Description 启动类加载器和扩展类加载器
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("启动类加载器");
        // 获取BootStrapClassLoader能够加载的api路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();

        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }

        // 从上面的路径中随意选择一个类，来看看他的类加载器是什么
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);

        // ---- 上面输出的都是引导类加载器

        System.out.println("扩展类加载器");
        String property = System.getProperty("java.ext.dirs");
        for (String s : property.split(";")) {
            System.out.println(s);
        }
    }
}
