class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st1 = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '#'){
                if(!st1.empty()){
                    st1.pop();
                }
            }
            else{
                st1.push(s.charAt(i));
            }
        }
        Stack<Character>st2 = new Stack<>();
        for(int i = 0;i<t.length();i++){
            if(t.charAt(i) == '#'){
                if(!st2.empty()){
                    st2.pop();
                }
            }
            else{
                st2.push(t.charAt(i));
            }
        }
        return st1.equals(st2);

    }
}