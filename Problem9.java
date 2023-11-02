class MaxmOfSubArrayLenK {
    static void getMaximum(int[] arr, int k) {
        int start = 0;
        int end = k-1;
        while(end < arr.length) {
            int max = Integer.MIN_VALUE;
            for(int i=start; i<=end; i++) {
                if(arr[i] > max)
                    max = arr[i];
            }
            System.out.print(max+" ");
            start++;
            end++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,1,4,5,2,3,6};
        int k = 3;
        getMaximum(arr, k);
    }
}