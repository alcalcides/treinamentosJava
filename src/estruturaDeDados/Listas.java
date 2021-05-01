package estruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Listas {
	public static void main(String[] args) {
		List<String> devs = new LinkedList<>();
		
		devs.add("Cascão");
		devs.add("Magali");
		devs.add("Cebolinha");
		devs.add("Mônica");
		
		
		for (Iterator<String> dev = devs.iterator(); dev.hasNext();) {
			String name = (String) dev.next();
			System.out.println("a // " + name);			
		}		
		
		for (String dev : devs) {
			System.out.println("b // " + dev);
		}		
				
		devs.forEach(dev -> {
			System.out.println("c // " + dev);
		});
		
		
	}
}
