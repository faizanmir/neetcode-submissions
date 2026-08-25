class Solution {
    public static int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String str : tokens) {
            Integer number = tryParseInt(str);
            if (number != null) {
                stack.addLast(number);
            } else {
                if (stack.size() >= 2) {
                    int b = stack.removeLast();
                    int a = stack.removeLast();
                    int res = applyOperator(a, b, str);
                    stack.addLast(res);
                } else {
                    throw new IllegalArgumentException("Insufficient operands for operator '" + str + "'");
                }
            }
        }
        if (stack.size() == 1) {
            return stack.removeLast();
        } else {
            throw new IllegalArgumentException("Invalid RPN expression");
        }
    }

    private static Integer tryParseInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static int applyOperator(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
            default:
                throw new IllegalArgumentException("Unsupported operator '" + operator + "'");
        }
    }
}
