package ch12_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) throws IOException {
		String path = "/Users/heji/Library/Temp/test7.txt";
		
		char a ='A';
		char b ='B';
		char c ='C';
		
		Writer writer = new FileWriter(path);
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.close();


		
	}

}
