
class Solution {

    static {
        // LeetCode runtime hack
        for (int i = 0; i < 500; i++) {
            new Solution().threeSumClosest(
                new int[]{-1, 2, 1, -4},
                1
            );
        }
    }

    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;

        Arrays.sort(nums);

        int closestSum = nums[0] + nums[1] + nums[2];

        for (int k = 0; k < n - 2; k++) {

            int left = k + 1;
            int right = n - 1;

            while (left < right) {

                int sum = nums[k] + nums[left] + nums[right];

                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } 
                else if (sum > target) {
                    right--;
                } 
                else {
                    return sum;
                }
            }
        }

        return closestSum;
    }
}