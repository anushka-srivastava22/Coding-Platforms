import java.util.*;

public class Main
{
    public String multiply(String n1 , String n2)
    {
        if(n1.charAt(0) == '0' || n2.charAt(0) == '0')
        {
            return "0";
        }
        
        int l1 = n1.length();
        int l2 = n2.length();
        char ans[] = new char[l1+l2];
        Arrays.fill(ans,'0');
        
        for(int i=l1-1;i>=0;i--)
        {
            int carry = 0;
            for(int j=l2-1;j>=0;j--)
            {
                int prod = ((n1.charAt(i) - '0') * (n2.charAt(j) - '0') + carry + (ans[i+j+1] - '0'));
                int last = prod % 10;
                ans[i+j+1] = (char)(last - '0');
                carry = prod/10;
                
            }
            if(carry != 0)
            {
                ans[i] = (char)( carry + '0');
            }
        }
        String res = new String(ans);
        
        if(res.charAt(0) != '0')
        {
            return res;
        }
        return res.substring(1);
        
    }
    
    
	
}
