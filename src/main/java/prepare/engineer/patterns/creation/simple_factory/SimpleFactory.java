package prepare.engineer.patterns.creation.simple_factory;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/16
 */

public class SimpleFactory {

    public Product createProduct(int type) {
        if (type == 1) {
            return new ConcreteProduct1();
        } else if (type == 2) {
            return new ConcreteProduct2();
        }
        return new ConcreteProduct3();
    }

}
