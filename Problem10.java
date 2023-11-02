class MaxSumStrictIncrSubArray {
    static int getMaxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[i-1] <arr[i]) {
                curSum += arr[i];

                if(curSum > maxSum)
                    maxSum = curSum;
            }
            else {
                if(curSum > maxSum)
                    maxSum = curSum;

                curSum = arr[i];
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,2,5,1,7};
        System.out.println(getMaxSum(arr));
    }
}