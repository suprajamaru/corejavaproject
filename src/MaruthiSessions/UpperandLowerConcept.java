package MaruthiSessions;

public class UpperandLowerConcept {

	public static void main(String[] args) {
		
		String s1="Hello to Welcome WithWorld";
		
		int upper1=0;
		int lower2=0;
		
		for(int i=0; i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>=65 && ch<=97)
			{
				upper1++;
			}
			else
			{
				lower2++;
			}
		
		}
		System.out.println(upper1);
		System.out.println(lower2);
		

	}

}
