package maps;

import java.util.HashMap;
import java.util.Map;

public class MapInterface 
{
	public static void main(String[] args)
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(10, "Entrada 1");
		map.put(20, "Entrada 2");
		map.put(30, "Entrada 3");
		map.put(40, "Entrada 4");
		map.put(50, "Entrada 5");
		
		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
