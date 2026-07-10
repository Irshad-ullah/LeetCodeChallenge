class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int operand1;
        int operand2;
        for (int i = 0; i < tokens.length; i++){
            switch(tokens[i]){
                case "+":
                    operand1 = stack.pop();
                    operand2 = stack.pop();
                    stack.push(operand1 + operand2);
                    break;
                case "-":
                    operand1 = stack.pop();
                    operand2 = stack.pop();
                    stack.push(operand2 - operand1);
                    break;
                case "*":
                    operand1 = stack.pop();
                    operand2 = stack.pop();
                    stack.push(operand2 * operand1);
                    break;
                case "/":
                    operand1 = stack.pop();
                    operand2 = stack.pop();
                    stack.push(operand2 / operand1);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
                    break;
            }
        }
        int result = stack.pop();
        return result;
    }
}