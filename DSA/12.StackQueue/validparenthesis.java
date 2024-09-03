package Solutions.DSA.12.StackQueue;

// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack=new Stack<>();
//         for(char c: s.toCharArray())
//         {
//             if(c == '(')
//                 stack.push(')');
//             else if(c == '{')
//                 stack.push('}');
//             else if(c == '[')
//                 stack.push(']');
//             else if(stack.isEmpty() || stack.pop() != c)
//                 return false;
//         }
//         return stack.isEmpty();
//     }
// }

class validparenthesis {
    public boolean isValid(String s) {
        char chars[]=s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c: chars)
        {
            if(c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
                continue;
            }
            else if(stack.isEmpty())
                return false;
            char top=stack.pop();
            if(top == '(' && c != ')')
                return false;
            else if(top == '{' && c != '}')
                return false;
            else if(top == '[' && c != ']')
                return false;
        }
        return stack.isEmpty();
    }
}