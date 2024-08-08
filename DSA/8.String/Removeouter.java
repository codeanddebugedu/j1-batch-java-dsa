class RemoveOuter 
{
        public String removeOuterParentheses(String S) 
        {
            StringBuilder s = new StringBuilder();
            int cnt = 0;
            for (char c : S.toCharArray()) 
            {
                if (c == '(' && cnt++ != 0) 
                {
                    s.append(c);
                }
                if (c == ')' && cnt-- != 1) 
                    s.append(c);
            }
        return s.toString();
    }
}