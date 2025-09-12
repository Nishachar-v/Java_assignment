import java.util.*;
public class Main{
		      
       	static void Si(double p, double r, double t){
			     
	       	double si = (p*r*t)/100;
	        System.out.println("Simple interest is: " +si);
	}
		       
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
			      
	      	double p = sc.nextDouble();
			       
		double r = sc.nextDouble();
			       
		double t = sc.nextDouble();
			       
		Si(p,r,t);
	}

}

	
