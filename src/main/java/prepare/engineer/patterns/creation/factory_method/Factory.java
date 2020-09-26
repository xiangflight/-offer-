package prepare.engineer.patterns.creation.factory_method;

import prepare.engineer.patterns.creation.simple_factory.Product;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/16
 */

public abstract class Factory {

    abstract public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }

}
