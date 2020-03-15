package ReverseWordsInAStringIII;

/**
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class Solution {
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");
        for (String word: words){
            for (int i = 0; i < word.length(); i++) {
                result.append(word.charAt(word.length()-i-1));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {

        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
