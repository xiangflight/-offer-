package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/4
 * <p>
 * double check locking
 * applying to multi-thread environment.
 */

class DclSingleton {

    private static DclSingleton INSTANCE = null;

    private DclSingleton() {
    }

    static DclSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DclSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DclSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
