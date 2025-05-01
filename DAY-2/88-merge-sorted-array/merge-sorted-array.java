class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int h1= m-1;
        int h2=n-1;
        int h=m+n-1;

        while(h2>=0)
        {
            if(h1 >= 0 && nums1[h1]>nums2[h2])
            {
                nums1[h--]=nums1[h1--];
            }
            else {
                nums1[h--]=nums2[h2--];
            }
        }
        
    }
}