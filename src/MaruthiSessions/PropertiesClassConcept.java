package MaruthiSessions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;


public class PropertiesClassConcept {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\","bbb.properties");
		f.createNewFile();
		
		FileWriter fr=new FileWriter(f);
		Properties pr=new Properties();
		pr.setProperty("anna", "mukesh");
		pr.setProperty("thamba", "kranthi");
		pr.store(fr, "Now this is working");
//		String pk=pr.getProperty("anna");
//		System.out.println(pk);
//		//pr.store(fr, "kkkkkkkkkkkk1111111111");
		
		
	}
	

}
