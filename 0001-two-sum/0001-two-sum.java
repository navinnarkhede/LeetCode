class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> Map = new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            int sum = target - nums[i];

            if(Map.containsKey(sum))
            {
                return new int[] {Map.get(sum),i};
            }
            Map.put(nums[i],i);
       }
        return new int[]{-1,-1};
    }

}