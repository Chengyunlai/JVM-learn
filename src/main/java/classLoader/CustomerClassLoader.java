package classLoader;

import java.io.FileNotFoundException;
import java.io.Reader;

/**
 * @ClassName
 * @Description 自定义用户类加载器
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class CustomerClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] classFromCustomPath = getClassFromCustomPath(name);
            if (classFromCustomPath == null){
                throw new FileNotFoundException();
            }else {
                return defineClass(name, classFromCustomPath,0,classFromCustomPath.length);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        throw new ClassNotFoundException(name);
    }

    private byte[] getClassFromCustomPath(String name){
        // 从自定义路径中加载指定类
        // 如果指定路径的字节码文件进行了加密，则需要在此方法中进行解密操作
        return null;
    }
}
