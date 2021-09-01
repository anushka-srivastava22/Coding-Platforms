public class Main
{
     static class Pair {
        int num;
        String str;
        Pair(int num,String str)
        {
            this.num = num;
            this.str = str;
            
        }
    }
    
    public static String integertoRoman(int n)
    {
        Pair ar[] = {
            new Pair(1000, "M"), new Pair(900, "CM"), new Pair(500, "D"), new Pair(400, "CD"), new Pair(100, "C"), 
            new Pair(90, "XC"), new Pair(50, "L"), new Pair(40, "XL"), new Pair(10, "X"), new Pair(9, "IX"),
            new Pair(5, "V"), new Pair(4, "IV"), new Pair(1, "I")
        };
        StringBuilder sb = new StringBuilder();
        while(n >= 0)
        {
            for(Pair val : ar)
            {
                n -= val.num;
                sb.append(val.str);
                break;
            }
        }
         return sb.toString();
    }
    

}
