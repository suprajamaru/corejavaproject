package MaruthiSessions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterConcept {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\","bbb.txt");
		f.createNewFile();
		FileWriter fr=new FileWriter(f);
		
		BufferedWriter bw=new BufferedWriter(fr);
		String s="Good morning guys";
		bw.write(s);
		bw.flush();
		bw.close();
		
		
		
	}

}
