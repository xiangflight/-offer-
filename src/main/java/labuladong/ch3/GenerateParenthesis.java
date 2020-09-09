package labuladong.ch3;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/9
 */

public class GenerateParenthesis {

    public static void main(String[] args) {
        List<String> res = new GenerateParenthesis().generateParenthesis(2);
        System.out.println(res);
    }

    List<String> generateParenthesis(int n) {
        List<String> res = new LinkedList<>();
        StringBuilder track = new StringBuilder();
        backtrack(n, n, track, res);
        return res;
    }

    private void backtrack(int left, int right, StringBuilder track, List<String> res) {
       if (left > right) {
           return;
       }
       if (left < 0 || right < 0) {
           return;
       }
       if (left == 0 && right == 0) {
           res.add(track.toString());
           return;
       }

       track.append("(");
       backtrack(left - 1, right, track, res);
       track.deleteCharAt(track.length() - 1);

       track.append(")");
       backtrack(left, right - 1, track, res);
       track.deleteCharAt(track.length() - 1);
    }

}
