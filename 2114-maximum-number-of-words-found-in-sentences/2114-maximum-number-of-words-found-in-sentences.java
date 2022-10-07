class Solution {
    public int mostWordsFound(String[] sen) {
        String temp;
        int count=0;
        int ans =0;
        for(int i = 0 ; i<sen.length; i++)
        {
             temp = sen[i];
                for(int j = 0; j<sen[i].length(); j++)
                {
                    char ch = temp.charAt(j);
                        if (ch==' ')
                        {
                            count++;
                        }
                }
            if(count > ans)
            {
             ans = count;
            }
            count = 0;
        }
         
        return ans +1;
          
        
    }
}
