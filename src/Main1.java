import java.util.*;
public class Main1{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str=in.nextLine();
            Map map=new HashMap();

            int   i=Integer.valueOf(str.substring(2),16);
            String s1=Integer.toBinaryString(i);

            System.out.println(Integer.valueOf(s1,2));
        }
    }
}