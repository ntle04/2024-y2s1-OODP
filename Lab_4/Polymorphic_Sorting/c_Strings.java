package Lab_4.Polymorphic_Sorting;

import java.util.Scanner;
public class c_Strings {
    // --------------------------------------------
// Reads in an array of strings, sorts them,
// then prints them in sorted order.
// --------------------------------------------
public static void main (String[] args)
{
	Comparable[] stringList;
	int size;
	Scanner scan = new Scanner(System.in);
	System.out.print ("\nHow many strings do you want to sort? ");
	size = scan.nextInt();
	stringList = new Comparable[size];
	System.out.println ("\nEnter the strings...");
	for (int i = 0; i < size; i++)
		stringList[i] = scan.next();
		a_Sorting.insertionSort(stringList);
		System.out.println ("\nYour strings in sorted order...");
	for (int i = 0; i < size; i++)
		System.out.print(stringList[i] + "\n");
	System.out.println ();
	}    
}
