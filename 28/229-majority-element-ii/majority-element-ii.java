class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0;int c2=0;int cdt1=0;int cdt2=1;
        for(int num:nums)
        {
            if(num==cdt1){c1++;}
            else if(num==cdt2){c2++;}
            else if(c1==0){cdt1=num;c1++;}
            else if(c2==0){cdt2=num;c2++;}
            else {c1--;c2--;}
        }

        c1=c2=0;
        for(int num:nums)
        {
            if(num==cdt1){c1++;}
            else if(num==cdt2){c2++;}
        }

        List<Integer> res=new ArrayList<>();
        if(c1>nums.length/3){res.add(cdt1);}
        if(c2>nums.length/3){res.add(cdt2);}
        return res;
        
    }
}