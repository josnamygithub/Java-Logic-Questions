/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
  public static void main (String[]args)
  {
	int a = 10, b = 20;

	  System.out.println ("Before Swap a " + a + " ,  b = " + b);
	  a = a ^ b;
	  b = a ^ b;
	  a = a ^ b;
	  System.out.println ("After Swap a " + a + " , b = " + b);

  }
}
