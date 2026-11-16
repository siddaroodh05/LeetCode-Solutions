class Solution {
    public int characterReplacement(String s, int k) {

        //in window i can have k most differnt characters and which can be same  and remaining should be same characters but not same as k characters..
        int[] freq=new int[26];
        int start=0;
        int i=0;
        int maxlensubstring=0;
        while(i < s.length()){
            char ch=s.charAt(i);
            freq[ch -'A']++;
            int maxfreqlen=0;
            for(int val :freq){
                maxfreqlen=Math.max(maxfreqlen,val);
            }
            int windowsize=i-start+1;

            while( windowsize - maxfreqlen > k ){
                char oldchar = s.charAt(start);
                freq[ oldchar - 'A']--;
                start++;
                maxfreqlen=0;
                for(int val :freq){
                maxfreqlen=Math.max(maxfreqlen,val);
                windowsize=i-start+1;
            }

            }
             maxlensubstring= Math.max(maxlensubstring,windowsize);

            i++;
        }
        return maxlensubstring;
        
    }
}