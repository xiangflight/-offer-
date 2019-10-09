package com.xiangflight.leetcode;

import java.util.HashMap;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/8 8:04 下午
 * <p>
 * Leetcode 631 Design Excel Sum Formula
 */

public class Excel {

    private int[][] arr;
    private HashMap<String, String[]> map;

    public Excel(int H, char W) {
        arr = new int[H][W - 'A' + 1];
        map = new HashMap<>();
    }

    public void set(int r, char c, int v) {
        String key = r + ":" + c;
        map.remove(key);
        arr[r - 1][c - 'A'] = v;
    }

    public int get(int r, char c) {
        String key = r + ":" + c;
        if (map.containsKey(key)) {
            return sum(r, c, map.get(key));
        }
        return arr[r - 1][c - 'A'];
    }

    public int sum(int r, char c, String[] strs) {
        int sum = 0;
        for (String str: strs) {
            int index = str.indexOf(":");
            if (index == -1) {
                sum += get(Integer.parseInt(str.substring(1)), str.charAt(0));
            } else {
                String a = str.substring(0, index);
                String b = str.substring(index + 1);
                int x1 = Integer.parseInt(a.substring(1)), y1 = a.charAt(0) - 'A';
                int x2 = Integer.parseInt(b.substring(1)), y2 = b.charAt(0) - 'A';
                for (int i = x1; i <= x2; i++) {
                    for (int j = y1; j <= y2; j++) {
                        sum += get(i, (char)(j + 'A'));
                    }
                }
            }
        }
        map.put(r + ":" + c, strs);
        return sum;
    }

}
