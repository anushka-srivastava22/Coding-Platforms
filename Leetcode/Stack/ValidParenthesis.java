class Solution {
    public boolean isValid(String s) {
       char ar[] = s.toCharArray();
        Stack<Character> set = new Stack();
        for(Character ch:ar)
        {
            if(ch=='(' || ch=='{' || ch == '[')
            {
                set.push(ch);
            }
            else if(ch=='}')
            {
                if(set.isEmpty() || set.peek() != '{')
                {
                    return false;
                }
                set.pop();
            }
             else if(ch==')')
            {
                if (set.isEmpty() || set.peek() != '(' )
                {
                    return false;
                }
                 set.pop();
            }
            else if (ch == ']') {
				if (set.isEmpty() || set.peek() != '[') {
					return false;
				} 
				set.pop();
			} 
        }
        return set.size() == 0;
    }
}
