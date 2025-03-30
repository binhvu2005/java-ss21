import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int age;
        System.out.println("Nhập tuổi của bạn: ");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        try {
            CheckAge(age);
        }catch (IllegalArgumentException e) {
            System.out.println("Lỗi: Tuổi không hợp lệ.");
        } finally {
            scanner.close();
        }

    }

    private static void CheckAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Tuổi phải lớn hơn 18");
        } else {
            System.out.println("Tuổi của bạn là: " + age);
        }
    }
}
