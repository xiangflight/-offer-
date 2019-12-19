package algo.string;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/19
 */

public class RegularExpression {

    public static void main(String[] args) {
        System.out.println("LeetCode_666".matches("\\w{12}"));
        System.out.println(isValidPhoneNumber("17328722442"));
    }

    public static boolean isValidPhoneNumber(String number) {
        return number.matches("\\d{11}");
    }

}
