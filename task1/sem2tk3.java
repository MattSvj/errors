//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.


package task1;

import java.util.Scanner;

public class sem2tk3 {

    public static void main(String[] args) {
        string();
    }

    private static void string() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();
        if (str.isEmpty()) {
            throw new RuntimeException("Exception: str is empty!");
        }
        in.close();
        System.out.println(str);
}
}



//Задание 2
/* 
package task1;

public class sem2tk3 {

    public static void main(String[] args) {
    
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} 
catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
    }
}
*/