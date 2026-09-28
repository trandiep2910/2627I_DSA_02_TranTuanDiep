import java.io.*;
import java.util.*;

public class QueueUsingTwoStacks {

    static class MyQueue<T> {
        // stackIn dùng để nhận dữ liệu mới
        private Deque<T> stackIn = new ArrayDeque<>();
        // stackOut dùng để lấy dữ liệu ra
        private Deque<T> stackOut = new ArrayDeque<>();

        // Truy vấn loại 1: Thêm phần tử vào cuối hàng đợi
        public void enqueue(T item) {
            stackIn.push(item);
        }

        // Truy vấn loại 2: Xóa phần tử ở đầu hàng đợi
        public T dequeue() {
            shiftStacks();
            return stackOut.pop();
        }

        // Truy vấn loại 3: Xem phần tử ở đầu hàng đợi
        public T peek() {
            shiftStacks();
            return stackOut.peek();
        }

        // Hàm phụ : Đổ dữ liệu từ In sang Out khi Out trống
        private void shiftStacks() {
            if (stackOut.isEmpty()) {
                while (!stackIn.isEmpty()) {
                    stackOut.push(stackIn.pop());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int q = scanner.nextInt();
            MyQueue<Integer> queue = new MyQueue<>();

            for (int i = 0; i < q; i++) {
                int type = scanner.nextInt();

                if (type == 1) {
                    int x = scanner.nextInt();
                    queue.enqueue(x);
                } else if (type == 2) {
                    queue.dequeue();
                } else if (type == 3) {
                    System.out.println(queue.peek());
                }
            }
        }

        scanner.close();
    }
}