import java.util.Scanner;
public class palindromesub {
    public boolean palin(String s){
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        palindromesub o=new palindromesub();
        String st=s.next(),an="";
        for(int i=0;i<st.length();i++){
            for(int j=i+1;j<st.length();j++){
                if(o.palin(st.substring(i,j))&&st.substring(i,j).length()>an.length()){
                    an=st.substring(i,j);
                }
            }
        }
        System.out.println(an);
    }
}
