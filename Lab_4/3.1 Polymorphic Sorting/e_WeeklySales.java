package Lab_4;

// *************************************************************
// WeeklySales.java
//
// Sorts the sales staff in descending order by sales.
// ************************************************************
public class e_WeeklySales
{
	public static void main(String[] args)
	{
		d_SalePerson[] salesStaff = new d_SalePerson[10];
		salesStaff[0] = new d_SalePerson("Jane", "Jones", 3000);
		salesStaff[1] = new d_SalePerson("Daffy", "Duck", 4935);
		salesStaff[2] = new d_SalePerson("James", "Jones", 3000);
		salesStaff[3] = new d_SalePerson("Dick", "Walter", 2800);
		salesStaff[4] = new d_SalePerson("Don", "Trump", 1570);
		salesStaff[5] = new d_SalePerson("Jane", "Black", 3000);
		salesStaff[6] = new d_SalePerson("Harry", "Taylor", 7300);
		salesStaff[7] = new d_SalePerson("Andy", "Adams", 5000);
		salesStaff[8] = new d_SalePerson("Jim", "Doe", 2850);
		salesStaff[9] = new d_SalePerson("Walt", "Smith", 3000);

		a_Sorting.insertionSort(salesStaff);

		System.out.println ("\nRanking of Sales for the Week\n");

		for (d_SalePerson s : salesStaff)
			System.out.println (s);
	}
}
