package String;

import java.util.HashMap;
import java.util.Map;

public class Characterduplicate {
    public static void FindCharacterDuplicate(String a) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<a.length();i++){
            if(map.containsKey(a.charAt(i))==true){
                int t=map.get(a.charAt(i));
                t++;
                map.put(a.charAt(i),t);
            }
            else{
                map.put(a.charAt(i), 1);
            }
        }
        if(map.isEmpty()==true){
            System.out.println("NO");
            return;
        }
        map.forEach((k,v)->{
            if(v>1){
                System.out.println(k);
            }
        });
    }
    public static void main(String[] args) {
        FindCharacterDuplicate("khaadsdddj");
    }
}
