package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 */

public class Solution005 {

    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        int i = str.length() - 1;
        for (char c : str.toString().toCharArray()) {
            if (c == ' ') {
                str.append("  ");
            }
        }
        int j = str.length() - 1;
        while (i >= 0) {
            char c = str.charAt(i);
            if (c != ' ') {
                str.setCharAt(j--, c);
            } else {
                str.setCharAt(j--, '0');
                str.setCharAt(j--, '2');
                str.setCharAt(j--, '%');
            }
            i--;
        }
        return str.toString();
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            nums1[k--] = (nums1[i] < nums2[j]) ? nums2[j--]: nums1[i--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

}
