class LargestSubArray0Sum {
    static int getMaxLen(int N, int[] A) {       //O(N^2)
        int maxLen = Integer.MIN_VALUE;
        for(int i=0; i<N; i++) {
            int sum = 0;
            int len = 0;
            for(int j=i; j<N; j++) {
                sum += A[j];

                if(sum == 0) {
                    len = j-i+1;
                    if(len > maxLen)
                        maxLen = len;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int N = 8;
        int[] A = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(getMaxLen(N, A));
    }
}