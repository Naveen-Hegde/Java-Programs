import java.io.FileInputStream;
import java.io.FileOutputStream;

public class alphabetoperations {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Documents\\Alphabets.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\Documents\\consonant.txt");
		int ch = 0;
		String vowels = "aeiouAEIOU";
		while((ch =fis.read()) != -1)         
		{
			  char c = (char)ch;
		      if(vowels.indexOf(c)==-1)
		      fos.write(c);
		}		
		fis.close();
		fos.close();
	}
}

