import java.util.Scanner;

public class CheckBit {
    public static int checkBit(int num,int base){
        if((num &(1<<base))==0){
          return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        System.out.println("Enter the Base :");
        int base=sc.nextInt();
        int val=checkBit(num,base);
        System.out.println("the value is : "+val);
    }
}