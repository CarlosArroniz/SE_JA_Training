package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample 
{
	public static void main(String[] args)
	{
		Map map = new HashMap();
		
		//Adding elements to map
		
		map.put(1, "Entrada 1");
		map.put(2, "Entrada 2");
		map.put(3, "Entrada 3");
		map.put(4, "Entrada 4");
		map.put(5, "Entrada 5");
		
		//Traversing Map
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) 
		{
			//Converting to Map.Entry so that we can get key and value separately
			Map.Entry entry = (Map.Entry)itr.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
