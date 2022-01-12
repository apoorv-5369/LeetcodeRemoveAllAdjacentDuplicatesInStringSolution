class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if(stack.empty()) stack.push(c);
            else if(stack.peek() == c){
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        while(!stack.empty()) {
            str.append(stack.pop());
        }
        return str.toString();
    }
}
