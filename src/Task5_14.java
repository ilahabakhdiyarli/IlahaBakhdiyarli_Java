import java.util.Scanner;

public class Task5_14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ay nomresini daxil edin: ");
        int ay=sc.nextInt();

        switch (ay){
            case 1,2,3:
                System.out.println("I rüb");
                break;
            case 4,5,6:
                System.out.println("II rüb");
                break;
            case 7,8,9:
                System.out.println("III rüb");
                break;
            case 10,11,12:
                System.out.println("IV rüb");
                break;
            default:System.out.println("Yanlis ay");
        }
    }
}
