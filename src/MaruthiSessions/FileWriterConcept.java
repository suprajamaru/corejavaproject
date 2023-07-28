package MaruthiSessions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterConcept {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\","mno.txt");
		f.createNewFile();
//		
//		File f1=new File("D:\\","PQR");
//		f1.mkdir();
//		
//		
//		File f3=new File(f1,"aaa.txt");
//		f3.createNewFile();
		
		FileWriter fw=new FileWriter(f);
		fw.write('h');
		fw.write('e');
		fw.write('y');
		fw.write('\n');
		
		char []ch= {'h','i','m','a','n'};
		fw.write(ch);
		fw.flush();
		fw.close();
		
		
		
		
		
		
		
		
	}

}
