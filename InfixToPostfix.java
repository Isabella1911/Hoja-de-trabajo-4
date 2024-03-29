/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Isabella Obando 23074*/
public class InfixToPostfix {
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String convert(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new ArrayListStack<>();
        stack.push('#');

        for (int i = 0; i < expression.length(); ++i) {
            char c = expression.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push('(');
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty() && stack.peek() != '#') {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
