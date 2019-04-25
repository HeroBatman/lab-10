public class Exception2 {
    public static void ArrayIndexOut(){
        try{
            int c[] = {1};
            c[100] = 666;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("2. Ошибка индексации вне границ массива");
            System.out.println(e.getMessage());
        }
    }
}