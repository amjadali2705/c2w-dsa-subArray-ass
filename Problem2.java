class EquilibriumIdx {
    public static void main(String[] args) {
        int[] A = new int[] {1, 3, 5, 2, 2};

        //Brute Force   O(N^2)
        // int flag = 0;
        // for(int i=0; i<A.length; i++) {         
        //     int leftSum = 0;
        //     int rightSum = 0;
            
        //     for(int j=0; j<i; j++) {
        //         leftSum += A[j];
        //     }

        //     for(int j=i+1; j<A.length; j++) {
        //         rightSum += A[j];
        //     }

        //     if(leftSum == rightSum) {
        //         flag = 1;
        //         System.out.println(i);
        //         break;
        //     }
        // }
        // if(flag == 0)
        //     System.out.println("-1");



        //Optimized Approach        O(N)
        int flag = 0;
        int[] leftSum = new int[A.length];
        int[] rightSum = new int[A.length];

        leftSum[0] = A[0];
        for(int i=1; i<A.length; i++) {
            leftSum[i] = leftSum[i-1] + A[i];
        }

        rightSum[A.length-1] = A[A.length-1];
        for(int i = A.length-2; i>=0; i--) {
            rightSum[i] = rightSum[i+1] + A[i];
        }

        for(int i=0; i<A.length; i++) {
            if(leftSum[i] == rightSum[i]) {
                flag = 1;
                System.out.println(i+1);
                break;
            }
        }
        if(flag == 0)
            System.out.println("-1");
    }
}