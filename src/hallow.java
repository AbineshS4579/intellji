import java.util.*;
//import java.math.;

public class hallow {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n*2-1;i++){
            int c;
            if(i<n){
                c=2*(n-i)-1;
            }
            else c=2*(i-n+1)+1;
            for(int j=0;j<c;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n*2-c;j++){
                if (j==0||j==n*2-c-1)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
