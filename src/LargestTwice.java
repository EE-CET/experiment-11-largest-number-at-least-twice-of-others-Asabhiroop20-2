import java.util.Scanner;
public class LargestTwice {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Step 1: Find the largest element and its index
        int max = nums[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        // Step 2: Check if max is at least twice every other number
        boolean condition = true;
        for (int i = 0; i < n; i++) {
            if (i != maxIndex && max < 2 * nums[i]) {
                condition = false;
                break;
            }
        }

        // Step 3: Output the result
        if (condition) {
            System.out.println(maxIndex);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}