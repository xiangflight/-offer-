package prepare.java.base;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/14
 */

public class StaticSequenceTest {

    public static String staticField = "静态变量";

    static {
        System.out.println("静态语句块");
    }

    public String field = "实例变量";

    {
        System.out.println("普通语句块");
    }

    public StaticSequenceTest() {
        System.out.println("构造函数");
    }

    public static void main(String[] args) {
        StaticSequenceTest initialOrder = new StaticSequenceTest();
    }

}
