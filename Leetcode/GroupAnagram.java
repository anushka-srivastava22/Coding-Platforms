import java.util.*;
public class Main
{
    public static List<List<String>> groupAnagram(String s[])
    {
        Map<String,List<String>> tm = new HashMap<>();
        for(String val : s)
        {
            int a[] = new int[26];
            for(int j=0;j<val.length();j++)
            {
                a[val.charAt(j) - 'a']++;
            }
            String st = Arrays.toString(a);
            tm.putIfAbsent(st,new ArrayList<>());
            tm.get(st).add(val);
        }
        return new ArrayList<>(tm.values());
    }
    
}
