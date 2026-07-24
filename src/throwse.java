class b{
   static void div()throws Exception{
        int i=45/0;
        System.out.println(i);
    }

}
public class throwse {
    public static void main(String[] args){
        try{
            b.div();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
