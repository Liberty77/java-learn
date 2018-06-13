package crazy;

/** 疯狂Java 讲义
 * Created by Gaol on 2018/6/13.
 */
public class CrazyTest {

    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();

    public void testMethod() {

        System.out.println(s1 == s2);
    }

}
