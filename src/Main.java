import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str=in.nextLine();
            Map<Character ,Integer> map=new HashMap<>();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)<='Z'&&str.charAt(i)>='A'){
                    if(map.containsKey(str.charAt(i))){
                        int a=map.get(str.charAt(i));
                        map.put(str.charAt(i),a+1);
                    }else{
                        map.put(str.charAt(i),1);
                    }
                }
            }
            for (char i='A'; i <='Z' ; i++) {
                if(map.containsKey(i)){
                    System.out.println(i+":"+map.get(i));
                }else{
                    System.out.println(i+":"+0);
                }
            }
        }
    }
}