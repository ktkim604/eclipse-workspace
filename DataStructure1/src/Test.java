import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class Test {
    public static void main(String[] args) {
        String postfixLine;
        PostfixEvaluation postfixEval; // PostfixEvaluation 클래스 사용
        double result;
        Scanner inFile = null;
        try {
            inFile = new Scanner(new File("input.txt"));
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
            System.exit(1);
        }
        while (inFile.hasNextLine()) {
            postfixLine = inFile.nextLine();
            System.out.println(postfixLine);
            InfixToPostfixConversion postfix = new InfixToPostfixConversion();
            postfixLine = postfix.evaluatePostfix(postfixLine);
            System.out.println("==> "+postfixLine);
            postfixEval = new PostfixEvaluation();
            result = postfixEval.evaluatePostfix(postfixLine); 
            if(result != 0)
                System.out.printf("= %.2f\n", result);
            System.out.println();
        }
        inFile.close();
    }
}

