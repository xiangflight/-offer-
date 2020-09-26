package prepare.engineer.patterns.creation.factory_method;

import prepare.engineer.patterns.creation.simple_factory.ConcreteProduct1;
import prepare.engineer.patterns.creation.simple_factory.Product;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/16
 */

public class ConcreteFactory1 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
