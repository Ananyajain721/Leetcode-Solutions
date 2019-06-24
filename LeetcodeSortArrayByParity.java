class Solution {
    public int[] sortArrayByParity(int[] A) {
        int c=-1;
        int in=0;
        int[] a=new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
                c++;
        }
        c=c+1;
         for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
            {
                a[in]=A[i];
                in++;
            }
             else
             {
                 a[c]=A[i];
                 c++;
             }
        }
        return a;
    }
}