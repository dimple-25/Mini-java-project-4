package poly;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
		 LinkedPolynomial zero = new LinkedPolynomial(0, -1);
		 LinkedPolynomial p1   = new LinkedPolynomial(4, 3);
		 LinkedPolynomial p2   = new LinkedPolynomial(3, 2);
		 LinkedPolynomial p3   = new LinkedPolynomial(1, 0);
		 LinkedPolynomial p4   = new LinkedPolynomial(2, 1);
		 LinkedPolynomial p    = p1.add(p2).add(p3).add(p4);
		 LinkedPolynomial q1   = new LinkedPolynomial(3, 2);
		 LinkedPolynomial q2   = new LinkedPolynomial(5, 0);
		 LinkedPolynomial q    = q1.add(q2);
		 LinkedPolynomial r    = p.add(q);
		 LinkedPolynomial s    = p.times(q);
		 LinkedPolynomial t    = p.sub(q);
		 System.out.println("zero(x) =     " + zero);
		 System.out.println("p(x) =        " + p);
		 System.out.println("q(x) =        " + q);
		 System.out.println("p(x) + q(x) = " + r);
		 System.out.println("p(x) * q(x) = " + s);
		 System.out.println("p(x) - q(x) = " + t);
		 LinkedPolynomial a1   = new LinkedPolynomial();
		 LinkedPolynomial a2   = new LinkedPolynomial();
		/*while(true)
		{
			System.out.println("Enter choice:\n1. declare first polynomial\n2. declare second polynomial\n3. add polynomials\n4. subtract polynomials\n5. multiply polynomials\n6. exit");
			Scanner ob1= new Scanner(System.in);
			int choice=ob1.nextInt();
			if(choice>=1 && choice<=5)
			{
				switch(choice)
				{
				case 1:a1.getpol1();
				break;
				case 2:a2.getpol2();
				break;
				case 3:a1.add(a2);
				break;
				case 4:a1.times(a2);
				break;
				case 5:a1.sub(a2);
				break;
				}
			}
			else
			{
				break;
			}
		}*/
		
	 }	 
}