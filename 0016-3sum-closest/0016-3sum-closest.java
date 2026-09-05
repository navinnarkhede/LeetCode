class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;

        Arrays.sort(nums);

        int closestSum = nums[0] + nums[1] + nums[2];

        for (int k = 0; k < n - 2; k++) {

            int left = k + 1;
            int right = n - 1;

            while (left < right) 
            {

                int sum = nums[k] + nums[left] + nums[right];

                // Check whether current sum is closer
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {

                    closestSum = sum;
                }

                // Move pointers
                if (sum < target) {
                    left++;
                } 
                else if (sum > target) {
                    right--;
                } 
                else {
                    return sum;   // exact answer
                }
            }
        }
        return closestSum;
    }
}