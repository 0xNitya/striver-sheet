class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s = ''.join(ch.lower() for ch in s if ch.isalnum())  # clean the string
        return s == s[::-1]  # compare with its reverse
