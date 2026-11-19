class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character,String> letters=new HashMap<>();
        letters.put('2', "abc");
        letters.put('3', "def");
        letters.put('4', "ghi");
        letters.put('5', "jkl");
        letters.put('6', "mno");
        letters.put('7', "pqrs");
        letters.put('8', "tuv");
        letters.put('9', "wxyz");
        List<String> lettercombinations = new ArrayList();
        backtrack(digits,letters,0,new StringBuilder(),lettercombinations);
        return lettercombinations;

        

    }
    void backtrack(String digits,Map<Character,String> letters,int index,StringBuilder str,      List<String> lettercombinations){
        if(str.length()==digits.length()) {
            lettercombinations.add(str.toString());
            return;
        }
        String string =letters.get(digits.charAt(index));


        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            str.append(ch);
            backtrack(digits,letters,index+1,str,lettercombinations);
            str.deleteCharAt(str.length()-1);
        }


    }
}