// Exercise Question
import java.util.*;
public class daytwo {

    public static int sumOfTwoNum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println(sum);
        return sum;
    }

    public static int factorialOfNum(int n){
        if(n <= 0){
            System.out.println("Invalid number");
            return 0;
        }
        int fact = 1;
        for(int i = n; i >=1; i--){
            fact = fact * i;
        }
        System.out.println(fact);
        return fact;
    }

    public static int avgOfThreeNum(int a, int b, int c){
        int avg = (a + b + c)/3;
        System.out.println(avg);
        return avg;
    }

    public static int sumOfOddNum(int m){
        int odd = 0;
        for(int i = 1; i <= m; i++){
            if(i % 2 != 0){
                odd = odd + i;
            }
        }
        System.out.println(odd);
        return odd;
    }

    public static void greaterOfTwoNum(int n1, int n2){
        if(n1 > n2){
            System.out.println("n1 is greater than n2");
        }else if(n1 < n2){
            System.out.println("n2 is greater than n1");
        }else if(n1 == n2){
            System.out.println("n1 and n2 both are equal values");
        }
        return;
    }

    public static double circumOfCircle(double radius){
        double circum = 2 * 3.14 * radius;
        System.out.println(circum);
        return circum;

    }

    public static void eligibleAge(int age){
        if(age > 18){
            System.out.println("Voter is eligible to vote");
        }else if(age <= 18 && age >0){
            System.out.println("voter is not eligible to vote");
        }else{
            System.out.println("invalid Input");
        }
        return;
    }

    public static int powerFinding(int val, int pow){
        int power = 1;
        for(int i = 1; i <= pow;i++){
            power = power * val;
        }
        System.out.println(power);
        return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Q.1 Sum of two numbers using function.
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // sumOfTwoNum(num1, num2);

        // Q.2 Find factorial of number using function.
        // int n = sc.nextInt();
        // factorialOfNum(n);

        // Q.3 Enter 3 numbers from the user & make a function to print their average.
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // avgOfThreeNum(a, b, c);

        // Q.4 Write a function to print the sum of all odd numbers from 1 to n
        // int m = sc.nextInt();
        // sumOfOddNum(m);

        // Q.5 Write a function which takes in 2 numbers and returns the greater of those two
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // greaterOfTwoNum(n1, n2);

        // Q.6 Write a function that takes in the radius as input and returns the circumference of a circle.
        // double radius = sc.nextDouble();
        // circumOfCircle(radius);

        // Q.7 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
        // int age = sc.nextInt();
        // eligibleAge(age);

        // Q.8 Write an infinite loop using do while condition
        // do { 
            
        // } while (true);

        // Q.9 Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
        // int pos = 0;
        // int neg = 0;
        // int zero = 0;
        // System.out.println("press'1' if want to give input and '0' if not");
        // int input = sc.nextInt();
        // while(input == 1){
        //     System.out.println("enter your number: ");
        //     int number = sc.nextInt();
        //     if(number >0){
        //         pos++;
        //     }
        //     if(number <0){
        //         neg++;
        //     }
        //     if(number == 0){
        //         zero++;
        //     }
        //     System.out.println("Press 1 to continue & 0 to stop");
        // input = sc.nextInt();
        // }
        // System.out.println("no. of positive number: " + pos);
        // System.out.println("no. of negative number: " + neg);
        // System.out.println("no. of negative number: " + zero);

        // Q.10 Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
        System.out.println("enter the value: ");
        int val = sc.nextInt();
        System.out.println("enter the power to calculate: ");
        int pow = sc.nextInt();

        // simple format.
        // int power = 1;
        // for(int i = 1; i <= pow;i++){
        //     power = power * val;
        // }
        // System.out.println(power);

        // function format
        powerFinding(val, pow);

    }
    
}
