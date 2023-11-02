import java.util.ArrayList;

class SubArrayWithSum {
    static ArrayList<Integer> getSubArrayIdx(int[] A, int N, int S) {
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0; i<N; i++) {
            int currSum = A[i];

            if(currSum == S) {
                res.add(i);
                return res;
            } else {
                for(int j=i+1; j<N; j++) {
                    currSum += A[j];
                    if(currSum == S) {
                        res.add(i+1);
                        res.add(j+1);
                        return res;
                    }    
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = new int[] {1, 2, 3, 7, 5};
        int N = 5;
        int S = 12;
        System.out.println(getSubArrayIdx(A, N, S));
    }
}