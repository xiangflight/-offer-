package prepare.engineer.algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/15
 */

public class CartesianProduct {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6, 7}};
        List<List<Integer>> res = new CartesianProduct().product(arr);
        System.out.println(res);
    }

    private List<List<Integer>> product(int[][] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        if (arr.length == 0) {
            return ans;
        }
        findProduct(ans, arr, 0, new LinkedList<>());
        return ans;
    }

    private void findProduct(List<List<Integer>> ans, int[][] arr, int pos, LinkedList<Integer> temp) {
        if (pos == arr.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < arr[pos].length; i++) {
            temp.add(arr[pos][i]);
            findProduct(ans, arr, pos + 1, temp);
            temp.removeLast();
        }
    }

}
