import java.util.*;

public class dayone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // PATTERNS MAKING
        
        // 1. Solid Rectangle.
        System.out.println("------PATTERNS MAKING------");

        System.out.println("enter the number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

        // 2. Half Pyramid.
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

        // 3. Hollow Rectangle.
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || j == 1 || i == n || j == n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 4. Inverted half Pyramid.
        for(int i = n; i >0; i--){
            for(int j = 0; j < i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

        // 5. Inverted & Rotated Half Pyramid.
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 6. Half Pyramid with Numbers.
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 7. Inverted Half Pyramid with Numbers.
        for(int i = n; i >0; i--){
            for(int j = 1; j <= i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 8. Floyd's Triangle.
        int number = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" " + number + " ");
                number++;
            }
            System.out.println();
        }
        System.out.println();

        // 9. 0-1 Triangle.
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}
