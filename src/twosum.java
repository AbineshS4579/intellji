import java.util.Scanner;
public class twosum {
    public static void main(String[] args){// only for the sorted array
        Scanner s=new Scanner(System.in);
        int a[]={1,4,3,4,5},t=8,l=0,r=4,m=0;
        while(l<r){
            m=a[l]+a[r];
            if(m==t){
                System.out.println("found"+l+" "+r);
                return;
            }
            if(m<t)
                l++;
            else
                r--;
        }
        System.out.println(l+" "+r);
    }
}
