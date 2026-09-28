import java.io.*;
import java.util.*;

public class StackNQueue {

    private static boolean isMatch(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }

    public static String isBalanced(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return "NO";
                }
                char top = stack.pop();
                if (!isMatch(top, c)) {
                    return "NO";
                }
            }
        }

        // Nếu stack rỗng thì cân bằng, ngược lại là dư ngoặc mở
        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < t; i++) {
                String s = scanner.nextLine();
                System.out.println(isBalanced(s));
            }
        }

        scanner.close();
    }
}