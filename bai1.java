
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Nhap so: ");
            num = sc.nextInt();
            if (num == 5) {
                System.out.println("Da nhap so 5 -> dung chuong trinh");
                break;
            }
        }
    }
}