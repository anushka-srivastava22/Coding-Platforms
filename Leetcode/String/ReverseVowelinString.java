class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        
        List<Character> list=Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] arr = s.toCharArray();
        while(i<j)
        {
            if(!list.contains(arr[i]))
            {
                i++;
            }
            if(!list.contains(arr[j]))
            {
                j--;
            }
            if(list.contains(arr[i]) && list.contains(arr[j]))
            {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }            
        }
        return new String(arr);
    }
}
