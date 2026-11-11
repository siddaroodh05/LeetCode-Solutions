class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {

            while (left <right && !ischarvalid(s.charAt(left)))
                left++;
            while (left < right && !ischarvalid(s.charAt(right)))
                right--;
            if (Character.toLowerCase(s.charAt(left)) != 
                 Character.toLowerCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }

    boolean ischarvalid(char ch) {
        if (Character.isLetterOrDigit(ch)) {
            return true;
        }
        return false;
    }
}