class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber==0){return "";}
        else 
        return convertToTitle((columnNumber - 1) / 26) + (char) ('A' + ((columnNumber - 1) % 26));
    }
}