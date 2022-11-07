package task1;


public class task01 {

    public static void main(String[] args) {
        int[] a1 = {12, 14, 15, 62, 12};
        int[] a2 = {11, 1, 32, 23, 22};
        System.out.println(VNumber(a1, a2));
    }


    private static int[] VNumber(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Ошибка, массивы разной длины!");
        }

        int[] newArray;
        newArray = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            newArray[i] = arr1[i] - arr2[i];
        }
        return newArray;
    }
}