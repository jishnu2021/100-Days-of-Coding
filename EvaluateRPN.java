import java.util.Stack;

public class EvaluateRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (!token.equals("")) {
                switch (token) {
                    case "+":
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case "-":
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case "/":
                        b = stack.pop();
                        a = stack.pop();
                        stack.push(a / b);
                        break;
                    default:
                        stack.push(Integer.parseInt(token));
                        break;
                }
            }
        }
        
        return stack.pop();
    }

    public static void main(String[] args) {
        EvaluateRPN solution = new EvaluateRPN();

        
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println(solution.evalRPN(tokens1)); 

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println(solution.evalRPN(tokens2)); 

        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(solution.evalRPN(tokens3)); 
    }
}
