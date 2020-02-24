import javax.swing.*;
import java.io.FileReader;

public class saukhidoi {
    public static int calculate(int firstOperand,int secondOperand,char operator) {
        switch (operator) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand != 0)
                    return firstOperand/secondOperand;

                    else
                    throw new RuntimeException("khong the chia cho 0");
            default:
                    throw new RuntimeException("hoat dong khonf duoc ho tro");

        }
    }
}
