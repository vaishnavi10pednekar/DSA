// Arrays
import java.util.*;
public class daythree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // int []marks = new int[5];
        // marks[0] = 76;
        // marks[2] = 67;
        // marks[4] = 90;

        // System.out.println(Arrays.toString(marks));

        // int size = sc.nextInt();
        // int []age = new int[size];
        // for(int i = 0; i < size; i++){
        //     age[i] = sc.nextInt();
        // }

        // for (int i = 0; i < size; i++) {
        //     System.out.print(age[i] + " ");
        // }
        // System.out.println();
        // System.out.println(Arrays.toString(age));
        // System.out.println(age.length);

        //Find both minimum and maximum elements in an array.
        // int n = sc.nextInt();
        // int []num = new int[n];

        // for(int i = 0; i < n; i++){
        //     num[i] = sc.nextInt();
        // }

        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // for(int i = 0; i < n; i++){
        //     if(max < num[i]){
        //         max = num[i];
        //     }else if(min > num[i]){
        //         min = num[i];
        //     }
        // }
        // System.out.println("max number is: " + max);
        // System.out.println("min number is: " + min);

        // Arithemetic operation on array.
//         int siz = sc.nextInt();

//         int []arith = new int[siz];
        
//         for(int i = 0; i < siz; i++){
//             arith[i] = sc.nextInt();
//         }

//         int sum = 0;
//         int mul = 1;
//         int div = 1;
//         for(int i = 0; i < siz; i++){
//             sum = sum + arith[i];
//             mul = mul * arith[i];
//             div = div / arith[i];
//         }

//         int diff = arith[0];
//         for(int i = 1; i < siz; i++){
//             diff = diff - arith[i];
// }

//         System.out.println("sum is: " + sum);
//         System.out.println("diff is: " + diff);
//         System.out.println("mul is: " + mul);
//         System.out.println("div is: " + div);

        // Reversing of an array.
        // int s = sc.nextInt();

        // String []fruit = new String[s];

        // for(int i = 0; i < s; i++){
        //     fruit[i] = sc.next();
        // }

        // System.out.println(Arrays.toString(fruit));
        // for(int i = s - 1; i >= 0; i--){
        //     System.out.print(fruit[i] + " ");
        // }

        // Reversing of string.
        String str = sc.next();

        // char []arr = str.toCharArray();
        // for(int i = arr.length - 1; i >=0; i--){
        //     System.out.print(arr[i]);
        // }

        // Reversing a string using command.
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev);

    }
}