package handling;
	
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileHandling {
	public void Datahandling() throws IOException
	{
		File f=new File("../Fhandling"); // for creating connection with file //.. relative path
		FileReader fr=new FileReader(f); // read the data character by character;
		int a; // a is a integer 
		while((a=fr.read())!=-1) // int a should be converted to char
		{
			System.out.println((char)a); // so we do explicit int a will be stored in char
		}
		}
public static void main(String[] args) throws IOException {
	FileHandling obj=new FileHandling();
	obj.Datahandling();	
}
}
