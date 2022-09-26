import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Nhap vao mot so nguyen, In ra so du trong phep chia 5
        //B1. Nhap vao 1 so nguyen
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen: ");
        int num = sc.nextInt();
        //B2. In ro du trong phep chia 3
        if (num % 3 == 0) {
            System.out.println("So nguyen chia het cho 3");
        } else if (num % 3 == 1) {
            System.out.println("So nguyen chia 3 du 1");
        } else {
            System.out.println("So nguyen chia 3 du 2");
        }
    }
}