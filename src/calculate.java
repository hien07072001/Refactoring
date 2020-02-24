public class calculate {


    public static  int calculate(int a,int b,char o){
        switch (o){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                if (b!=0)
                    return a/b;
                else
                    throw new RuntimeException("khong the chia cho 0");
            default:
                throw new RuntimeException("hoat dong khong duoc ho tro");

        }
    }
}
