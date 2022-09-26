package ra;


import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        //Nhập thông tin sinh viên bao gồm mã sinh viên, tên sinh viên, tuổi, giới tính, dia chi, diem danh gia (A,B,C,D)
        //Khai báo đối tượng scanner hỗ trợ nhap du lieu tu ban phim
        Scanner sc = new Scanner(System.in);
        //B1. Thong bao nhap
        System.out.println("Nhap vao ma sinh vien: ");
        //B2-3. Dung sc de lay du lieu tu ban phim va luu vao bien
        String studentId = sc.nextLine();

        System.out.println("Nhap vao ten sinh vien: ");
        String studentName = sc.nextLine();

        System.out.println("Nhap vao tuoi sinh vien: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Nhap vao gioi tinh sinh vien: ");
        boolean sex = Boolean.parseBoolean(sc.nextLine());

        System.out.println("Nhap vao dia chi sinh vien: ");
        String address = sc.nextLine();

        System.out.println("Nhap vao diem danh gia cua sinh vien: ");
        char mark = sc.nextLine().charAt(0);

        //In ra thông tin sinh viên
        System.out.printf("Ma SV: %s - Ten SV: %s - Tuoi: %d - Gioi tinh: %b\n",studentId,studentName,age,sex);
    }
}
