package _14LongestCommonPrefix;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String[] strs2 = {"dog","racecar","car"};
        System.out.println(Arrays.toString(strs));

        String result = longest_CommonPrefix(strs);

        System.out.println(result);
    }
    public static String longest_CommonPrefix(String[] strs) {
        Arrays.sort(strs); //accending order  "flight","flow","flower"
        String first = strs[0];
        String last = strs[strs.length-1];
        int i = 0;
        while (i < first.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }
}
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.