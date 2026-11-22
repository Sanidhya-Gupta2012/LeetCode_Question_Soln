class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (st.isEmpty()) st.push(ch);
            else if (Math.abs(st.peek()-ch)==32)st.pop();
            else st.push(ch);
        }
        String ans="";
        for(char ch:st)ans+=ch;
        return ans;

    }
}