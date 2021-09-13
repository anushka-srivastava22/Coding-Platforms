import java.util.*;
public class Main
{
    
    public int longestValidParentheses(String s) 
    {
        Stack<Integer> st = new Stack<>();
        int maxim = 0;
        st.push(-1);
        for(int i=0;i<s.length();i++)
        {
            if(st.push(i) == '(')
            {
                st.push(i);
            }
            else
            {
                st.pop();
                if(st.empty())
                {
                    st.push(i);
                }
                else
                {
                    maxim = Math.max(maxim,i-st.peek());
                }
            }
        }
        return maxim;
    }
    
	
}
