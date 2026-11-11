class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int[] pfreq = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pfreq[p.charAt(i) - 'a']++;
        }

        int[] sfreq = new int[26];

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            sfreq[s.charAt(i) - 'a']++;

            if (i >= p.length() - 1) {

                if (iswindowAnagram(pfreq, sfreq))
                    ans.add(i - p.length() + 1);

                sfreq[s.charAt(i - p.length() + 1)-'a']--;
            }
        }
        return ans;

    }

    boolean iswindowAnagram(int[] arr1,int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i])return false;
        }
        return true;
    }

}