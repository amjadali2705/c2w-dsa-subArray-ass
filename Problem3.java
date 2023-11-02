class SubArray01 {
    static int getMaxLen(int[] A, int N) {
        int maxLen = Integer.MIN_VALUE;;
        for(int i=0; i<N; i++) {     //O(N^2)
            int zero = 0;
            int one = 0;
            int len = 0;
            for(int j=i; j<N; j++) {
                if(A[j] == 0) 
                    zero++;
                else
                    one++;

                if(zero == one) {
                    len = j-i+1;
                    if(len > maxLen)
                        maxLen = len;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] A = new int[] {0, 1, 0, 1};
        int N = 4;
        System.out.println(getMaxLen(A, N));
    }
}