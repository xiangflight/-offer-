package prepare.engineer.patterns.creation.singleton;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/16
 */

public enum  SingletonEnum {
    /**
     * 单例
     */
    INSTANCE;

    private String objectName;

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public static void main(String[] args) {
        SingletonEnum firstSingleton = SingletonEnum.INSTANCE;
        firstSingleton.setObjectName("firstName");
        System.out.println(firstSingleton.getObjectName());
        SingletonEnum secondSingleton = SingletonEnum.INSTANCE;
        secondSingleton.setObjectName("secondName");
        System.out.println(firstSingleton.getObjectName());
        System.out.println(secondSingleton.getObjectName());

        SingletonEnum[] enumConstants = SingletonEnum.class.getEnumConstants();
        for (SingletonEnum enumConstant : enumConstants) {
            System.out.println(enumConstant.getObjectName());
        }
    }

}
