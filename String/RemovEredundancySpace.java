package String;

public class RemovEredundancySpace {
    public static void main(String[] args) {
        String s="     dang                   PHuoC Khoa";
        System.out.println(s);
        s=s.trim();
        while(s.indexOf("  ")>1){
            s=s.replace("  ", " ");
        }
        
        String arr[]=s.split(" ");
        s="";
        for (String item : arr) {
           s+=item.substring(0,1).toUpperCase()+item.substring(1).toLowerCase()+" ";
        }
        System.out.println(s);
    }
}
