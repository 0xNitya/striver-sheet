class Solution {
    public void reverseString(char[] s) {
        swap(s,0,s.length-1);
        
    }
    static void swap(char s[],int l,int r)
    {
        while(l<r)
        {
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;r--;
        }
    }
}