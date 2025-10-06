public class Solution {

    // Function to remove duplicates
    public int removeDuplicates(int[] nums) {
        // Edge case: if the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

        // Initialize the index to track unique elements
        int k = 1; // The first element is always unique

        // Start iterating from the second element (index 1)
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one, it's unique
            if (nums[i] != nums[i - 1]) {
                // Place the unique element at position k and increment k
                nums[k] = nums[i];
                k++;
            }
        }

        // Return the count of unique elements
        return k;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = { 1, 1, 2 };
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Number of unique elements: " + k1);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        // Test case 2
        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("Number of unique elements: " + k2);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}
