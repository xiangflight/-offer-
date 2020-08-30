package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/27
 */

public class Solution087 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String password = sc.nextLine();
            int score = calculate(password);
            String level = judge(score);
            System.out.println(level);
        }
        sc.close();
    }

    private static int calculate(String password) {
        int score = 0;
        int len = password.length();
        score += scoreOfLen(len);
        int alphaScore = scoreOfAlpha(password);
        int digitScore = scoreOfDigit(password);
        int symbolScore = scoreOfSymbol(password);
        score += alphaScore;
        score += digitScore;
        score += symbolScore;
        if ((alphaScore != 0) && (digitScore != 0) && (symbolScore == 0)) {
            score += 2;
        }
        if ((digitScore != 0) && (symbolScore != 0)) {
            if (alphaScore == 10) {
                score += 3;
            } else if (alphaScore == 20) {
                score += 5;
            }
        }
        return score;
    }

    private static int scoreOfSymbol(String password) {
        int score;
        int symbolNum = 0;
        for (char ch: password.toCharArray()) {
            if ((ch >= 0x21 && ch <= 0x2F)
                    || (ch >= 0x3A && ch <= 0x40)
                    || (ch >= 0x5B && ch <= 0x60)
                    || (ch >= 0x7B && ch <= 0x7E)) {
                symbolNum++;
            }
        }
        if (symbolNum == 0) {
            score = 0;
        } else if (symbolNum == 1) {
            score = 10;
        } else {
            score = 25;
        }
        return score;
    }

    private static int scoreOfDigit(String password) {
        int score;
        int digitNum = 0;
        for (char ch: password.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitNum++;
            }
        }
        if (digitNum == 0) {
            score = 0;
        } else if (digitNum == 1) {
            score = 10;
        } else {
            score = 20;
        }
        return score;
    }

    private static int scoreOfAlpha(String password) {
        int score;
        int lowercase = 0;
        int uppercase = 0;
        for (char ch: password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowercase++;
            }
            if (Character.isUpperCase(ch)) {
                uppercase++;
            }
        }
        if ((lowercase == 0) && (uppercase == 0)) {
            score = 0;
        }
        if (lowercase == 0) {
            score = 10;
        } else if (uppercase == 0) {
            score = 10;
        } else {
            score = 20;
        }
        return score;
    }

    private static int scoreOfLen(int length) {
        if (length <= 4) {
            return 5;
        }
        if (length <= 7) {
            return 10;
        }
        return 25;
    }

    private static String judge(int score) {
        String level = "";
        if (score < 25) {
            level = "VERY_WEAK";
        } else if (score < 50) {
            level = "WEAK";
        } else if (score < 60) {
            level = "AVERAGE";
        } else if (score < 70) {
            level = "STRONG";
        } else if (score < 80) {
            level = "VERY_STRONG";
        } else if (score < 90) {
            level = "SECURE";
        } else {
            level = "VERY_SECURE";
        }
        return level;
    }

}
