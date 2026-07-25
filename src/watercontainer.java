import java.util.Scanner;
public class watercontainer {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int l=0,r=n-1,m=0;
        while(l<r){
            m=Math.max((Math.min(a[l],a[r])*(r-l)),m);
            if(a[l]<a[r])
                l++;
            else
                r--;
        }
        System.out.println(m);
    }
}
