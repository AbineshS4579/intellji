import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class network {
    public static void main(String[] args){
        try {
            InetAddress a = InetAddress.getLocalHost();
            System.out.println(a.getHostName());
            System.out.println(a.getHostAddress());
            Enumeration<NetworkInterface> i=NetworkInterface.getNetworkInterfaces();
            while(i.hasMoreElements()){
                NetworkInterface j=i.nextElement();
                System.out.println(j.getDisplayName());
                byte m[]=j.getHardwareAddress();
                if(m!=null){
                    StringBuilder s=new StringBuilder();
                    for(int k=0;k<m.length;k++){
                        s.append(String.format("%02x%s",m[k],k<m.length-1?"-":""));
                    }
                    System.out.println("mac:"+s.toString());
                }
                Enumeration<InetAddress> o=j.getInetAddresses();
                while(o.hasMoreElements()){
                    System.out.println("ip:"+o.nextElement().getHostAddress());
                }
            }
        }catch(Exception e){e.printStackTrace();}

    }
}
