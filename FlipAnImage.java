class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++)
        {
        int l=0;
            int h=A[0].length-1;
            while(l<=h)
            {
                int g=A[i][l]-1;
                int t=Math.abs(g);
                A[i][l]=Math.abs(A[i][h]-1);
                A[i][h]=t;
                l++;
                h--;
            }
        }
        return A;
    }
}