package MaruthiSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties2Concept {
	
	protected Properties prop2;
	

	public static void main(String[] args) throws IOException {
		
		 prop2=new Properties();
		 
		 FileInputStream fr=new FileInputStream("C:\\Users\\marip\\eclipse-workspace\\suprajajavaproject\\src\\MaruthiSessions\\db2.properties");
		 
		 prop2.load(fr);
		 
		String gmailid= prop2.getProperty("gmail");
		System.out.println(gmailid);
		
	}

}
