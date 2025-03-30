import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int num;
        System.out.println("Nhập một số nguyên: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        try {
            if (num < 0) {
                throw new IllegalArgumentException("Số phải lớn hơn hoặc bằng 0");
            } else {
                System.out.println("Số bạn đã nhập là: " + num);
            }
        } catch ( IllegalArgumentException e) {
            System.out.println("Lỗi: Số không hợp lệ.");
        } finally {
            System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
        }

    }
}
