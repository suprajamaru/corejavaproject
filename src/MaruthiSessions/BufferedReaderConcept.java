package MaruthiSessions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderConcept {
	
	public static void main(String[] args) throws IOException {
		
		File f= new File("D:\\","bbb.txt");
		FileReader fr=new FileReader(f);
		
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		System.out.println(line);
	}

}
