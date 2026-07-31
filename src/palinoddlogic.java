public class palinoddlogic {
    public static void main(String[] args){
        String s="babadc",res="";
        int reslen = 0;
        for(int i =0;i<s.length();i++){
            int l = i, r = i;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if((r-l+1) >reslen){
                    res = s.substring(l, r+1);
                    reslen = r-l +1;
                }
                l--;
                r++;
            }
        }
        for(int i =0;i<s.length();i++){ //"cbbd"
            int l = i, r = i+1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if((r-l+1) >reslen){
                    res = s.substring(l, r+1);
                    reslen = r-l +1;
                }
                l--;
                r++;
            }
        }
        System.out.println(res);
    }
}
