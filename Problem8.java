class MaxProdSubArray {
    static long getMaxProd(int N, int[] arr) {
        long maxProd = Long.MIN_VALUE;
        for(int i=0; i<N; i++) {
            long prod = 1;
            for(int j=i; j<N; j++) {
                prod *= arr[j];

                if (prod > maxProd) 
                    maxProd = prod;
            }
        }
        return maxProd;
    }
    public static void main(String[] args) {
        int N = 5;
        int[] arr = new int[] {6, -3, -10, 0, 2};
        System.out.println(getMaxProd(N, arr));
    }
}