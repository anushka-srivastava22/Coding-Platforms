class RepeatedSubstring
{
  public boolean repeatedSubstringPattern(String s)
  {
    if(s == null || s.length() <= 1)
    {
      return false;
    }
    int l = s.length();
    for(int i=1;i<l/2;i++)
    {
      if(len%i != 0)
      {
        continue;
      }
      String str = s.substring(0,i);
      StringBuilder sb = new StringBuilder();
        for (int j=0; j<len/i; j++) {
            sb.append(str);
        }
        if (s.equals(sb.toString())) {
            return true;
        }
    }
    return false;
    }
  }
}
