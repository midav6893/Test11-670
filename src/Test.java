import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test { 
	public static void main(String[] args) throws Exception { 
		
		char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		ArrayList<String> list = new ArrayList<>();
		for (int i = 1; i < 26300; i++) {
			list.add(Integer.toString(i));
		}
		Iterator<String> it = list.listIterator();
		while (it.hasNext()) {
			String s = it.next();
			for (int k = 0; k < c.length; k++) {				
				if (s.indexOf(c[k]) != s.lastIndexOf(c[k])) {
					it.remove();
					break;
				}
			}
		}
		try (Scanner sc = new Scanner(new File("input.txt"))){
			System.out.println(list.get(sc.nextInt()-1));
		}
	}
} 
