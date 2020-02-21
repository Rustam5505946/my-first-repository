import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String op = scanner.next();
        String left = scanner.next();
        String right = scanner.next();
        int rightint = Integer.parseInt(right);

        if (op.equals("exit")) {
            System.exit(0);
        }
        if (op.charAt(0) == '+' || op.charAt(0) == '-' || op.charAt(0) == '/' || op.charAt(0) == '*') {
            int leftint = Integer.parseInt(left);
            System.out.println(compute2(op, leftint, rightint));
            System.exit(0);
        }

        int opint = Integer.parseInt(op);
        System.out.println(compute2(left, opint, rightint));
        System.exit(0);


    }


    private static int compute2(String op, int left, int right) {
        switch (op.charAt(0)) {
            case '+':
                return left + right;
            case '-':
                return left - right;
            case '*':
                return left * right;
            case '/':
                return left / right;
        }
        throw new IllegalArgumentException("Unknown operator:" + op);
    }
}