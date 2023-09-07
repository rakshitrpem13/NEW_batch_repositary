package handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling1 {
	public void Datahandling1() throws IOException
	{
		File f=new File("../Fhandling/TT.txt");
		FileReader fr=new FileReader(f);
		int a;
		while((a=fr.read())!=-1)
		{
			System.out.println((char)a);
		}
	}
	public static void main(String[] args) throws IOException {
		FileHandling1 obj=new FileHandling1();
		obj.Datahandling1();	
	}
}
