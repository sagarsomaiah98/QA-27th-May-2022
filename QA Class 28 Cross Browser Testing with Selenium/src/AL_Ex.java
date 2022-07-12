import java.util.ArrayList;
import java.util.List;

public class AL_Ex {

	public static void main(String[] args) {
		
		
		//String[] links= new String[5];
		
		
		List<String> link= new ArrayList<String>();
		
		link.add("link1");
		link.add("link2");
		link.add("link3");
		link.add("link7");
		link.add("link9");
		
		
		System.out.println(link.size());
		
	//	System.out.println(link.get(5));
		
		for(int i=0;i<link.size();i++) {
		System.out.println(link.get(i));
	
		}
		

	}

}
