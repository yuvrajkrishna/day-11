public class pairs{
    public static void printPairs(int []arr){
        for(int i = 0 ;i<arr.length;i++){
            int tp = 0;
            int current = arr[i];
            for(int j = i+1;j<arr.length;j++){
                System.out.print(current + "," + arr[j] + " ");
                tp++;
            }
            System.out.println();

            System.out.println("Total pairs for " + current + " is " + tp);
        }
    }
    public static void main(String[] args){
        int [] arr = {2,4,6,8,10};
        printPairs(arr);
    }
}