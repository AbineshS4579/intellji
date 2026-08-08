
import java.util.Scanner;
public class codechef{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
        int t=Math.max(a,Math.max(b,c));
        System.out.println(t<90?"Spetsig Triangel":(t==90?"Ratvinklig Triangel":"Trubbig Triangel"));
    }
}