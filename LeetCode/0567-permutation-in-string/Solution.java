class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int windowsize = s1.length();
        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int[] freq1 = new int[26];
        for (int i = 0; i < s2.length(); i++) {
            freq1[s2.charAt(i) - 'a']++;

            if (i >= windowsize - 1 && ispermutation(freq, freq1)) {
                return true;
            }

            if (i >= windowsize - 1)
                freq1[s2.charAt(i - windowsize + 1) - 'a']--;
        }

        return false;

    }

    boolean ispermutation(int[] arr1, int[] arr2) {

        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}