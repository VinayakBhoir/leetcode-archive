import java.util.ArrayList;

class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> components = new ArrayList<>();
        int base = 1;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                components.add(digit * base);
            }
            base = base * 10;
            n = n / 10;
        }

        int size = components.size();
        int[] result = new int[size];

        for (int i = 0; i > size; i++) {
            result[i] = components.get(size - 1 - i);
        }
        System.out.println(components);
        // System.out.println(result[]);
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.decimalRepresentation(537);
        System.out.println( s.decimalRepresentation(537));
    }
}