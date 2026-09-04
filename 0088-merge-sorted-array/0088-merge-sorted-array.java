class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        m=m-1;
        n=n-1;
        int total = nums1.length-1;

        while(total >= 0)
        {
                if(m >= 0 && n >= 0 && nums1[m] > nums2[n])
                {
                    nums1[total] = nums1[m];
                    m--;
                }   
                else if(n >= 0)
                {
                    nums1[total] = nums2[n];
                    n--;
                } 
                total--;
        }
    }
}