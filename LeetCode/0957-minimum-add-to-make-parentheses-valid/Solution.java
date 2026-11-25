class Solution {
    public int minAddToMakeValid(String s) {
        if(s.isEmpty())return 0;
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='(')stack.push('(');

            else{

                if(stack.isEmpty())stack.push(')');

                else if(stack.peek()=='(')stack.pop();

                else stack.push(')');
            }
        }

        return stack.size();
    }
}


// (()))))

//O(1) space  can be achived using open and close varibles 
// if char=='(' open+=1
//else
// if open==0  close+=1 else open-=1;