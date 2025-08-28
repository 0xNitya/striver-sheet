class Solution {
    public boolean detectCapitalUse(String word) {
        boolean allUpper=true;
        boolean allLower=true;
        int n=word.length();

        for(int i=0;i<n;i++)
        {
            if(!Character.isUpperCase(word.charAt(i)))
            {
                allUpper=false;
            }
            if(!Character.isLowerCase(word.charAt(i)))
            {
                allLower=false;
            }
        }

        boolean firstUpper=Character.isUpperCase(word.charAt(0));
        for(int i=1;i<n;i++)
        {
            if(!Character.isLowerCase(word.charAt(i)))
            {
                firstUpper=false;break;
            }
        }

        return allUpper|| allLower||  firstUpper;
        
    }
}