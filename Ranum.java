import java.util.*;
public class Ranum{
    String r;
    Scanner sc=new Scanner(System.in);
    void generate(){
        Random ran=new Random();
        int a=ran.nextInt((999-100)+1)+100;
        r=String.valueOf(a);
        System.out.println("A random num generated *** ,Try Guessing");
    }
    void check(){
        StringBuilder sb=new StringBuilder("*** ");
        int k=0; 
        for(int i=0;i<10;i++){
            String a=sc.next();
            if(r.equals(a)){
                System.out.println("pass");
                k=1;
                break;
            }
            if(r.charAt(0)==a.charAt(0)){
                sb.replace(0,1,r.charAt(0)+"");
            }
            if(r.charAt(1)==a.charAt(1)){
                sb.replace(1,2,r.charAt(1)+"");
            }
            if(r.charAt(2)==a.charAt(2)){
                sb.replace(2,3,r.charAt(2)+"");
            }
            System.out.println(sb);
        }
        if(k==0){
            System.out.println("Fail");
        }
        System.out.println("Answer="+r);
    }
            
            
}