import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println("nhập chỉ số của mảng ");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            System.out.println("Giá trị tại chỉ số " + index + " là: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lỗi: Chỉ số mảng ngoài phạm vi.");
        }
    }
}
