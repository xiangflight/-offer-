package prepare.engineer.patterns.creation.prototype;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/16
 */

public class Client {

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("abc");
        Prototype clone = prototype.myClone();
        System.out.println(clone);
    }

}
