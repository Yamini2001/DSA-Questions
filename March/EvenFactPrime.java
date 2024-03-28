import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        int fact =1,i=1;
        for(i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
        if(n%i==0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}