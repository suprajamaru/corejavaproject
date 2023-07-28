package MaruthiSessions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterConcept {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\","abc123.txt");
		f.createNewFile();
		
		PrintWriter pr=new PrintWriter(f);
		pr.print("hi");
		pr.println();
		pr.println("java");
		pr.flush();
		pr.close();
		
		
	}
	

}
