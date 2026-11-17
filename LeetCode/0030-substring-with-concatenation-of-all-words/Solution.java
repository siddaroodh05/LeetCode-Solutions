class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> ans=new ArrayList<>();

        Map<String,Integer> needed=new HashMap<>();

        for(String word :words){

            needed.put(word,needed.getOrDefault(word,0)+1);

        }
        
        int n=s.length();

        int windowsize=words[0].length()*words.length;

        int size=words[0].length();
        
        
        for(int offset = 0 ; offset<size; offset++){

            int left=offset;
            int count=0;

            Map<String,Integer> required=new HashMap<>();

            for(int right=offset;right+size <= n;right+=size){

                String str=s.substring(right,right+size);
                
                if(!needed.containsKey(str)){
                    left=right+size;
                    count=0;
                    required.clear();
                    continue;
                }

                required.put(str,required.getOrDefault(str,0)+1);
                count++;

                while(required.get(str)> needed.get(str)){

                    String leftword=s.substring(left,left+size);

                    required.put(leftword,required.get(leftword)-1);

                    left+=size;
                    count--;
                }

                if(count==words.length)ans.add(left);


            }
      
        }

        return ans;

   }


}