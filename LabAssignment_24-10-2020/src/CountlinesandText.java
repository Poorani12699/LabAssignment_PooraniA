/*
 * Author : Poorani A
 * Date : 24/10/2020
 * Description : Program to count number of lines in text
 */
import java.util.*;
import java.io.*;
public class CountlinesandText
{
	public static void main(String[] args)throws IOException
	{
		try
		{
			int lines=0,chars=0,words=0;
			int code=0;
			File file = new File("E:\\sample.txt"); 
			FileInputStream fis = new FileInputStream(file);
			while(fis.available()!=0)
			{
				code = fis.read();
				if(code!=10)// if it is not equals new line
					chars++;
				if(code==32)// if it is equals to space
					words++;
				if(code==13)// if it is a carriage return
				{
					lines++;
					words++;
				}
			}
			System.out.println("No.of characters = "+chars);
			System.out.println("No.of words = "+(words+1));
			System.out.println("No.of lines = "+(lines+1));
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find the specified file...");
		}
	}
}