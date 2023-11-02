class SmallestSubArrayGtX {
    static int getMinLength(int[] A, int x) {
        int minLen = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++) {
            int sum = 0;
            int len = 0;
            for(int j=i; j<A.length; j++) {
                sum += A[j];

                if(sum > x) {
                    len = j-i+1;
                    if(len < minLen) {
                        minLen = len;
                        return minLen-1;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = new int[] {1, 4, 45, 6, 0, 19};
        int x = 51;
        System.out.println(getMinLength(A, x));
    }
}