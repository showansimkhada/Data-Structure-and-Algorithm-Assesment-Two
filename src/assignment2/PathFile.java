package assignment2;

import java.util.Scanner;
import java.io.*;

public class PathFile
{
	public static DLL ReadFile(String fileName) 
	{
		DLL list = new DLL();
		File f = new File(fileName);
		try
		{
			Scanner sc = new Scanner (f);
			while (sc.hasNextInt())
			{
				DLLNode nd = new DLLNode(sc.nextInt());
				list.addToTail(nd);
			}
			sc.close();
		}
		catch (IOException e)
		{
			System.out.println("Cannot find the file "+e.getMessage());
		}
		return list;
	}
}
