public class SumOddRange {
    public static void main(String[] args) {
        System.out.println("sum is equal to "+ sumOdd(1,100));
        System.out.println( isOdd(5)+" - that's the statement ");
    }
    public static boolean isOdd(int number){
        if (number>0){
            return number % 2 != 0;
        }
        else{
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if (start>0& end>0 & end>=start){
        for (int i=start ; i<=end; i++){
            if (isOdd(i)){
                 sum+=i;

            }
        }
        return sum;
    }
        else{
            return -1;
        }

    }
}
