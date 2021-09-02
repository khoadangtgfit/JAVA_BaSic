package String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input txt:");
        String txt=sc.nextLine();
        System.out.println("txt: "+txt);
        Pattern p=Pattern.compile("[^0-9]+$");
        if(p.matcher(txt).find()){
            System.out.println("OK");
        }else{
            System.out.println("txt not ok");
        }
    }
}
