//create ans arraylistsort array. remove duplicates . j=i+1 k=n-1; sum=i+j+k . if sum<0 j++ , if >0 k--
//else temp list=nums[i,j,k] ans.add(temp) j++ k--;
//while (j < k && arr[j] == arr[j - 1]) j++;while (j < k && arr[k] == arr[k + 1]) k--;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;

            int j=i+1;
            int k=n-1;

            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){j++;}
                else if(sum>0){k--;}
                else{
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }

        return ans;
    }
}