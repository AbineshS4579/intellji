interface camera{
    void photo();
}
interface battery{
    void mah();
}
interface display{
    void siz();
}
class smartphone implements camera,battery,display{
    public void mah(){
        System.out.println("photo");
    }
    public void photo(){
        System.out.println("camera");
    }
    public void siz(){
        System.out.println("display");
    }
}
public class phone {
    public static void main(String[] args){
        smartphone o=new smartphone();
        o.photo();
        o.mah();
        o.siz();
    }
}
