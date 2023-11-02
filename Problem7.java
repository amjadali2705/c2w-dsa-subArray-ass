class ReverseSubArray {
    static void reverseSubArray(int n, int[] arr, int L, int R) {
        while(L < R) {
            int temp = arr[L-1];
            arr[L-1] = arr[R-1];
            arr[R-1] = temp;
            L++;
            R--;
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
        int L = 2;
        int R = 4;
        reverseSubArray(n, arr, L, R);
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}