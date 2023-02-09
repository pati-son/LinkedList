package lab_4;
import lab_4.list.*;
public class Program{
	public static void main(String [] args){
		SortedIntegerList m = new SortedIntegerList(true);
		m.add(3);
		m.add(4);
		m.add(2);
		m.add(0);
		m.add(1);
		m.add(7);
		m.add(5);
		
		System.out.println(m);

		System.out.println(m.find(6));

	}
}