package fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFIleIO {
	public static void writeToFile(String str) {
		File file = new File("C:/Test/test.txt");
		PrintWriter printWriter = null;
		try {
			
			printWriter = new PrintWriter(file);
			
			printWriter.write(str);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			printWriter.close();
		}
		
		System.out.println("SUCCESS --- WRITE");
	}
	
	public static String readFile() {
		String str = "";
		
		File file = new File("C:/Test/test.txt");
		
		try {
			FileReader fileReader =  new  FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
                str += line;
            } 
			
			bufferedReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return str;
	}
	
}
