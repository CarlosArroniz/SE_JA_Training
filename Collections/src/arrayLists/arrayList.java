package arrayLists;
import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args)
	{
		ArrayList<String> alS = new ArrayList<String>();
		
		alS.add("Elemento 1");
		alS.add("Elemento 2");
		alS.add("Elemento 3");
		alS.add("Elemento 4");
		alS.add("Elemento 5");
		
		Iterator iter = alS.iterator();
		
		System.out.println("\nStarting to print the String Array List");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		ArrayList<Integer> alI = new ArrayList<Integer>();
		
		alI.add(1);
		alI.add(2);
		alI.add(3);
		alI.add(4);
		alI.add(5);
		
		iter = alI.iterator();
		
		System.out.println("\nStarting to print the Integer Array List");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		ArrayList<Object> alO = new ArrayList<Object>();
		
		alO.add("This is a String");
		alO.add(1);
		alO.add(true);
		alO.add(10.11);
		alO.add('Æ');
		
		iter = alO.iterator();
		
		System.out.println("\nStarting to print the Multiple type array list");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}