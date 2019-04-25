public class Exception1 {
        public static void ZeroException(){
            try{
                int a = 0;
                int b = 42/a;
            } catch (ArithmeticException e){
                System.out.println("1. Ошибка: нельзя делить на 0");
                System.out.println(e.getMessage());
            }
        }
    }
