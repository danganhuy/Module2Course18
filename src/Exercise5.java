public class Exercise5 {
    // [Bài tập] Hiển thị số chẵn/lẻ
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();
    }
}
