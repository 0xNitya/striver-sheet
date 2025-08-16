class Solution {
    public boolean isNumber(String s) {
        s = s.trim(); 
        String regex = "^[+-]?(\\d+(\\.\\d*)?|\\.\\d+)([eE][+-]?\\d+)?$";
        // mera lund lagaye algo
        return s.matches(regex);
    }
}
