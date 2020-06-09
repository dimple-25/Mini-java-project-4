package poly;

import java.util.Scanner;

public class LinkedPolynomial {

    private static class Node {
        int coef;
        int exp;
        Node next;
        Node(int coef, int exp) {
            this.coef = coef;
            this.exp  = exp;
        }
    }
    Node first = new Node(0, -1);
    Node last  = first;
   
    LinkedPolynomial() { }

    LinkedPolynomial(int coef, int exp) {
        last.next = new Node(coef, exp);
        last = last.next;
    }

    public LinkedPolynomial add(LinkedPolynomial b) {
        LinkedPolynomial a = this;
        LinkedPolynomial c = new LinkedPolynomial();
        Node x = a.first.next;
        Node y = b.first.next;
        while (x != null || y != null) {
            Node t = null;
            if(x == null)     
            { 
            	t = new Node(y.coef, y.exp);
            	y = y.next;
            }
            else if (y == null)
            {
            	t = new Node(x.coef, x.exp);
            	x = x.next;
            }
            else if (x.exp > y.exp)
            { 
            	t = new Node(x.coef, x.exp);
            	x = x.next;
            } 
            else if (x.exp < y.exp)
            {
            	t = new Node(y.coef, y.exp); 
            	y = y.next;
            } 

            else {
                int coef = x.coef + y.coef;
                int exp  = x.exp;
                x = x.next;
                y = y.next;
                if (coef == 0) 
                	continue;
                t = new Node(coef, exp);
            }
        
            c.last.next = t;
            c.last = c.last.next;
        }
        return c;
    }

    public LinkedPolynomial times(LinkedPolynomial b) {
        LinkedPolynomial a = this;
        LinkedPolynomial c = new LinkedPolynomial();
        for (Node x = a.first.next; x!= null; x = x.next) {
            LinkedPolynomial temp = new LinkedPolynomial();
            for (Node y = b.first.next; y!= null; y = y.next) {
                temp.last.next = new Node(x.coef * y.coef, x.exp + y.exp);
                temp.last = temp.last.next;
            }
            c = c.add(temp);
        }
        return c;
    }

    public LinkedPolynomial sub(LinkedPolynomial b) {
        LinkedPolynomial a = this;
        LinkedPolynomial c = new LinkedPolynomial();
        Node x = a.first.next;
        Node y = b.first.next;
        while (x != null || y != null) {
            Node t = null;
            if(x == null)
            {
            	t = new Node(y.coef, y.exp);
            	y = y.next;
            }
            else if(y == null)
            {
            	t = new Node(x.coef, x.exp);
            	x = x.next;
            }
            else if(x.exp > y.exp)
            {
            	t = new Node(x.coef, x.exp); 
            	x = x.next;
            } 
            else if(x.exp < y.exp)
            {
            	t = new Node(y.coef, y.exp); 
            	y = y.next;
            } 
            else
            {
                int coef = x.coef - y.coef;
                int exp  = x.exp;
                x = x.next;
                y = y.next;
                if (coef == 0) continue;
                t = new Node(coef, exp);
            }
        
            c.last.next = t;
            c.last = c.last.next;
        }
        return c;
    }

    public String toString() {
        String s="";
        for (Node x = first.next; x != null; x = x.next) {
            if      (x.coef > 0) s = s + " + " +   x.coef  + "x^" + x.exp;
            else if (x.coef < 0) s = s + " - " + (-x.coef) + "x^" + x.exp;
        }
        return s;
    }
    
    
    public void getpol1()
	 {
	 int[] co = new int[50];
	 int[] ex = new int[50];
	 Scanner ob1=new Scanner(System.in);
	 Scanner ob2=new Scanner(System.in);
	 LinkedPolynomial[] pp = new LinkedPolynomial[50];
	 int j,i=0;
	 System.out.println("Enter first polynomial coefficients and exponents:");
	 while(ob1!=null)
	 {
		 co[i]=ob1.nextInt();
		 ex[i]=ob2.nextInt();																			
		 pp[i]=new LinkedPolynomial(co[i],ex[i]);
		 i++;	 
	 }
	 LinkedPolynomial q=new LinkedPolynomial();
	 for(j=0;j<i;j++)
	 {
		 q    = q.add(pp[j]);
	 }
	 System.out.println("q(x) =        " + q);
	 }
    
    public void getpol2()
	 {
	 int[] co2 = new int[50];
	 int[] ex2 = new int[50];
	 String pattern="Z";
	 Scanner ob3=new Scanner(System.in);
	 Scanner ob4=new Scanner(System.in);
	 LinkedPolynomial[] pq = new LinkedPolynomial[50];
	 int j,i=0;
	 System.out.println("Enter second polynomial coefficients and exponents:");
	 while(ob3.hasNext(pattern))
	 {
		 co2[i]=ob3.nextInt();
		 ex2[i]=ob4.nextInt();
		 pq[i]=new LinkedPolynomial(co2[i],ex2[i]);
		 i++;	 
	 }
	 LinkedPolynomial q2    =new LinkedPolynomial();
	 for(j=0;j<i;j++)
	 {
		 q2    = q2.add(pq[j]);
	 }
	 System.out.println("q2(x) =        " + q2);
	 }
}

