package handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filehandling2 {
	public void Datahandling() throws IOException
	{
		File f= new File("../Fhandling/TT.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args) throws IOException {
		Filehandling2 obj= new Filehandling2();
		obj.Datahandling();
	}
}
