package ra;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        //Nhap vao 1 so tu 0-9, phien am so do
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen tu 0 -9:");
        int num = sc.nextInt();
        switch (num){
            case 0:
                System.out.println("Khong");
                break;
            case 1:
                System.out.println("Mot");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bon");
                break;
            case 5:
                System.out.println("Nam");
                break;
            case 6:
                System.out.println("sau");
                break;
            case 7:
                System.out.println("Bay");
                break;
            case 8:
                System.out.println("Tam");
                break;
            default:
                System.out.println("Chin");
        }
    }
}
