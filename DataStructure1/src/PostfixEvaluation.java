import java.util.Scanner;

public class PostfixEvaluation {
	
	ArrayStack stack = new ArrayStack(100);
    
    public double evaluatePostfix(String postfixLine){
        double data = 0;
 
        @SuppressWarnings("resource")
        Scanner Scan_token = new Scanner(postfixLine);
        double temp1, temp2;
        while(Scan_token.hasNext()){
            String find_token = Scan_token.next();
            if(isStringDouble(find_token))
                stack.push(find_token);
            else{
                if(less_than_2_stacksize(stack))
                    return 0;
                
                temp2 = Double.valueOf((String) stack.pop()).doubleValue();
                temp1 = Double.valueOf((String) stack.pop()).doubleValue();
                
                if(find_token.equals("+"))
                    data = temp1 + temp2;
                else if(find_token.equals("-"))
                    data = temp1 - temp2;
                else if(find_token.equals("*"))
                    data = temp1 * temp2;
                else if(find_token.equals("/"))
                    data = temp1 / temp2;
                else{
                    System.out.println("Unknown operator : "+find_token);
                    return 0;
                }
                String a = ""+data;
                stack.push(a);
            }
        }
        if(stack.getSize() >1){
            System.out.println("Too many operands.");
            return 0;
        }
        return data;
    }
    
     public static boolean isStringDouble(String s) {
            try {
                Double.parseDouble(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
     }
     
     public static boolean less_than_2_stacksize(ArrayStack stack){
         if(stack.getSize() <2){
                System.out.println("Not enough operand.");
                return true;
         }
         return false;
     }

}
