package crazy;

/**
 * Created by Gaol on 2018/6/13.
 */
public class Singleton {

    final String str = "Hello";

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {

       if(instance == null) {

         instance = new Singleton();
      }

       return instance;
    }

}
