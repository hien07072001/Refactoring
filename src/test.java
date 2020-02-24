public class test {
    public static  final char addition='+';
    public static  final char subtraction='-';
    public static  final char multiplication='*';
    public static  final char division='/';

    public static int calculate(int firstOperand,int secondOperand,char operator){
        switch (operator){
            case addition:
                return firstOperand+secondOperand;
            case subtraction:
                return firstOperand-secondOperand;
            case multiplication:
                return firstOperand*secondOperand;
            case division:
                if (secondOperand !=0)
                    return firstOperand/secondOperand;
                else
                    System.out.println("khong the chia cho 0");
            default:
                System.out.println("khonf xac dinh ");
        }


    }



}
