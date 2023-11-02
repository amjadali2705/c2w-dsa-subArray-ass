class SubArray0Sum {
    static boolean isSubArray0Sum(int[] arr, int n) {
        for(int i=0; i<n; i++) {
            int sum = arr[i];
            if(sum == 0)
                return true;

            for(int j=i+1; j<n; j++) {
                sum += arr[j];

                if(sum == 0)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[] {4, 2, -3, 1, 6};

        if(isSubArray0Sum(arr, n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}