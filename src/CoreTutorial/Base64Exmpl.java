package CoreTutorial;

import java.util.Base64;

public class Base64Exmpl {
    public static void main(String[] args){
        //Encoding Bytes
        Base64.Encoder encoder=Base64.getEncoder();
        String str=encoder.encodeToString("I love Simona".getBytes());
        System.out.println("Encoded String:"+str);
        Base64.Decoder decoder=Base64.getDecoder();
        String str1=new String(decoder.decode(str));
        System.out.println("Decode:"+str1);
        //Encoding URL
        Base64.Encoder encoder1=Base64.getUrlEncoder();
        String url=encoder1.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());
        System.out.println("Encoded URL: "+url);
        Base64.Decoder decoder1=Base64.getUrlDecoder();
        String durl=new String(decoder1.decode(url));
        System.out.println("Decoded URL: "+durl);
        //Encoding Mime
        Base64.Encoder encoder2= Base64.getMimeEncoder();
        String message="Hello!!\n You are informed regarding your inconsistent work";
        String mstr=encoder2.encodeToString(message.getBytes());
        System.out.println("Encoded Mime:"+ mstr);
        Base64.Decoder decoder2=Base64.getMimeDecoder();
        String dmstr=new String(decoder2.decode(mstr));
        System.out.println("Decoded MIME:"+dmstr);
    }
}
