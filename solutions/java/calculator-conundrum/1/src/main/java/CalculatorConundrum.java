class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        String result = "";
        try{
            if(operation == null){
                throw new IllegalArgumentException("Operation cannot be null");
            }

            if(operation == ""){
                throw new IllegalArgumentException("Operation cannot be empty");
            }
            switch(operation){
                case "+":
                    result = String.format("%d + %d = %d", operand1, operand2, operand1 + operand2);
                    break;
                case "*":
                    result = String.format("%d * %d = %d", operand1, operand2, operand1 * operand2);
                    break;
                case "/":
                    if(operand2 == 0){
                        throw new ArithmeticException("Division by zero is not allowed");
                    }
                    result = String.format("%d / %d = %d", operand1, operand2, operand1 / operand2);
                    break;
                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        }catch(ArithmeticException ae){
            throw new IllegalOperationException("Division by zero is not allowed", ae);
        }
        return result;
    }
}
