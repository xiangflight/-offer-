package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/4
 */

class StaticSingleton {

    private StaticSingleton() {
    }

    static StaticSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private static class InstanceHolder {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

}
