public class Solution {

    public int lengthOfLastWord(String s) {

        String[] words = s.trim().split(" ");

        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "Hello World";
        System.out.println("Length of the last word: " + solution.lengthOfLastWord(s1));

        String s2 = "   fly me   to   the moon  ";
        System.out.println("Length of the last word: " + solution.lengthOfLastWord(s2));

        String s3 = "luffy is still joyboy";
        System.out.println("Length of the last word: " + solution.lengthOfLastWord(s3));

        String s4 = "hello";
        System.out.println("Length of the last word: " + solution.lengthOfLastWord(s4));

        String s5 = "   ";
        System.out.println("Length of the last word: " + solution.lengthOfLastWord(s5));
    }
}
