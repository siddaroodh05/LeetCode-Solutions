class Solution {
    public boolean isValid(String s) {
    if(s.length()%2!=0)return false;
    Stack<Character> stack=new Stack<>();
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='{'||ch=='('||ch=='['){
            stack.push(ch);
        }
        else if(!stack.isEmpty()){
            char top=stack.peek();
            if(ch!='}' && top=='{' ||ch!=']' && top=='['||ch!=')'&& top=='('){
                return false;
            }
            else{
                stack.pop();
            }
        }
        else{
            return false;
        }
     }
     if(!stack.isEmpty()){
        return false;
     }
     return true;
    }
}