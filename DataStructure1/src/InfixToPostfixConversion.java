import java.util.Scanner;

public class InfixToPostfixConversion {
	public String evaluatePostfix(String postfixLine){
        
		String dab = "";
        ArrayStack stack = new ArrayStack(100);
        Scanner sc = new Scanner(postfixLine);
        
        while(sc.hasNext()){
            String find_token = sc.next();
            if(isStringDouble(find_token))
                dab += find_token+" ";
            else if(find_token.equals("+") || find_token.equals("-")){
                if(!stack.empty()&&!stack.peek().equals("(")){
                    while(!stack.empty()){
                        Object temp = stack.pop();
                        if(temp.equals("(")){
                            stack.push("(");
                            break;
                        }
                        dab += temp+" ";
                    }
                }
                stack.push(find_token);
            }
            
            else if(find_token.equals("*")||find_token.equals("/")){
                if(!stack.empty()&&(stack.peek().equals("*")||stack.peek().equals("/"))){
                    while(!stack.empty()){
                        Object temp = stack.pop();
                        if(temp.equals("(")){
                            stack.push("(");
                            break;
                        }
                        else if(temp.equals("-")){
                            stack.push("-");
                            break;
                        }
                        else if(temp.equals("+")){
                            stack.push("+");
                            break;
                        }
                        dab += temp+" ";
                    }
                }
                stack.push(find_token);
            }
            else if(find_token.equals("(")){
                stack.push(find_token);
            }
            else if(find_token.equals(")")){
                Object temp;
                while(true){
                    temp = stack.pop();
                    if(temp.equals("("))
                        break;
                    dab += temp + " ";
                }
            }
        }
        while(!stack.empty())
            dab += stack.pop()+" ";
        return dab;
    }
 
    public static boolean isStringDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
