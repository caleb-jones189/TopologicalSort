import java.util.*;
import java.io.*;
public class TopologicalSort
{
	public static void main(String[]args)
	{
		//File file=new File("graph.txt");
		//Scanner infile=new Scanner(file);

		int[][]arr=new int[5][5];

		int rowCount=0;
		int columCount=0;

		while(infile.hasNext())
		{
			String line=infile.nextLine();
			String[]lineArr=line.split(",");
			
			for(columCount=0;columCount<5;columCount++)
			{
				arr[rowCount][columCount]=Integer.parseInt(lineArr[columCount]);			
	
			}
					

		}

		

	
		
	}




}
