package design;

/**
 * 单例模式
 * 
 * 单例模式有 3 个特点：
 * 1. 单例类只有一个实例对象；
 * 2. 该单例对象必须由单例类自行创建；
 * 3. 单例类对外提供一个访问该单例的全局访问点。
 * 
 * @author liuw
 * @date 2020/9/9
 */
public class Singleton {

    public static void main(String[] args) {
        String a = null;
        if(a == null) {
            System.out.println(1);
        } 
        
        if (null == a) {
            System.out.println(2);
        }
    }
}
