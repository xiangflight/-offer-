package prepare.engineer.patterns.creation.singleton;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/16
 */

public class Singleton {

    private Singleton() {}

    private static class SingletonHolder {

        private static final Singleton INSTANCE = new Singleton();

    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
