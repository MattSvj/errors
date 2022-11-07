package task1;


public class sem1 {

    static final int INDEX = 12;
    public static void main(String[] args) {
        int[] arr = new int[11];
        System.out.println(findNumber(arr));
    }


    private static int findNumber(int[] arr) {
        if (arr.length < INDEX) {
            return -1;
        }
        return arr.length;
    }
}