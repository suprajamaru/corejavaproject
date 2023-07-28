package MaruthiSessions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderConcept {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\","kkk.txt");
		f.createNewFile();	
		try (FileWriter fr = new FileWriter(f)) {
			String s="hi guys";
			fr.write(s);
	}
		
		//FileReader fr=new FileReader(f);
//		int i=fr.read();
//		while(i!=-1)
//		{
//		System.out.println((char)i);
//		 i=fr.read();
//		}
		char[] ch=new char[(int)f.length()];
		FileReader fr=new FileReader(f);
		fr.read(ch);
		for(char ch1:ch)
		{
			System.out.println(ch1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
