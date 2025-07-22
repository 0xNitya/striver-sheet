class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int merged[]=new int[n1+n2];

        int i=0;int j=0;int k=0;
        
        while(i<n1 && j<n2)
        {
            if(nums1[i]<nums2[j]){merged[k++]=nums1[i++];}
            else {merged[k++]=nums2[j++];}
        }

        while(i<n1){merged[k++]=nums1[i++];}
        while(j<n2){merged[k++]=nums2[j++];}

        int total=merged.length;
        if(total % 2==1){return merged[total/2];}
        else return (merged[(total/2)-1]+merged[total/2])/2.0;
        
    }
}