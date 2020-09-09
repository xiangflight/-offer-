package regex.ch1;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/8
 */

public class CharacterClass {

    public static void main(String[] args) {
        String str = "0";
        boolean matches = str.matches("[0-9]");
        System.out.println(matches);
    }

}
