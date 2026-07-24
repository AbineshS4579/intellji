import java.util.Scanner;
class get_set {
private int l,w;
void with(int l,int w){
    this.l=l;
    this.w=w;
}
int display(){
    return l*w;
}
}
    public class getset {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int l=s.nextInt(),w=s.nextInt();
        get_set o=new get_set();
        o.with(l,w);
        System.out.println(o.display());
    }
}
