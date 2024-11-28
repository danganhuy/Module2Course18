public class Exercise4 {
    // [Bài tập] Tạo thread đơn giản
    public static void main(String[] args) {
        NumberGenerator ng1 = new NumberGenerator();
        NumberGenerator ng2 = new NumberGenerator();

        ng1.start();
        ng2.start();
    }
}
