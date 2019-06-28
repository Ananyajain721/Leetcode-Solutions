class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       ArrayList<Integer> a=new ArrayList<>();
        while(left<=right)
        {
            int n=left;
            while(n>0)
            {
                int m=n%10;
                if(m==0)
                    break;
                if(left%m!=0)
                    break;
                n=n/10;
                
            }
            if(n==0)
                a.add(left);
            left++;
        }
        return a;
    }
}