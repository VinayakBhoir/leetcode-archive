import java.util.Stack;

public class Solution {

    // Method to check if the parentheses are valid
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Map to store matching pairs of parentheses
        java.util.Map<Character, Character> bracketMap = new java.util.HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        for (char c : s.toCharArray()) {
            // If it's a closing bracket
            if (bracketMap.containsKey(c)) {
                // Pop the top element if the stack is not empty, else use a dummy value
                char topElement = stack.isEmpty() ? '#' : stack.pop();

                // If the top element doesn't match the corresponding opening bracket, return
                // false
                if (topElement != bracketMap.get(c)) {
                    return false;
                }
            } else {
                // If it's an opening bracket, push it onto the stack
                stack.push(c);
            }
        }

        // If the stack is empty, all brackets matched properly
        return stack.isEmpty();
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String[] testCases = { "()", "()[]{}", "(]", "([])", "([)]" };

        for (String testCase : testCases) {
            boolean result = solution.isValid(testCase);
            System.out.println("Input: \"" + testCase + "\" is valid? " + result);
        }
    }
}
