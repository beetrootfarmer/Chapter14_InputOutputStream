package ch12_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample3 {
	public static void main(String[] args) throws IOException {
		
		String path = "/Users/heji/Library/Temp/test10.txt";
		
		String str = "KOREA";		
		
		Writer writer = new FileWriter(path);
		
		writer.write(str);
	
		
		writer.close();


		
	}

}
