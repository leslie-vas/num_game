/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int t=0,ch=0;
		Scanner sc=new Scanner(System.in);
		while(t==0){
		    System.out.println("1.Play 2.exit");
		    ch=sc.nextInt();
		    switch(ch){
		        case 1:
		            Ranum m=new Ranum();
		            m.generate();
		            m.check();
		            break;
		        case 2:
		            t=1;
		            break;
		    }
		}
	}
}
