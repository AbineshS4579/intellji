
import java.util.*;
public class exception {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),a[]=new int[n],sum=0;
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
        }

        try {for(int  i:a) {

            if(i<0)
                throw new Exception("Invalid no."+i);
            sum+=i;
        }

        }catch(Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("sum:"+sum);
        }

    }

}
