import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert int to str
        String[] strNums = Arrays.stream(nums)
                                 .mapToObj(String::valueOf)
                                 .toArray(String[]::new);

        // Sort with custom comparator: descending based on concatenation
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is "0", return "0" (handle all-zero case)
        if (strNums[0].equals("0")) return "0";

        // Join all strings to form the final result
        return String.join("", strNums);
    }
}
