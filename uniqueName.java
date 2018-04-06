/*takes in unique names as user input and returns a list sans repeats*/
import java.util.ArrayList;

import acm.program.*;

public class uniqueName extends ConsoleProgram {

	public void run() {
		println("This returns a list of unique names. Enter a blank line to stop.");
		println("");
		ArrayList<String> names = new ArrayList<String>();
		 while (true) {
			 String v = readLine("Enter name : ");
			 if (v.equals("")==true) break; 
			 if(names.contains(v)==false){
					names.add(v);
					}
			 }
		 println("");
		 println("Unique names list contains : ");
		 for(int i=0; i<names.size();i++) {
			 println(names.get(i));
		 }
	}

}
