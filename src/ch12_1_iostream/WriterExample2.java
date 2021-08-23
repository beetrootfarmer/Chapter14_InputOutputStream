package ch12_1_iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample2 {
	public static void main(String[] args) throws IOException {
		String path = "/Users/heji/Library/Temp/test8.txt";
		
		char[] array = { '반', '갑', '습', '니', '다', '!', '어', '떻', '게', '지', '내' , '세', '요', '?'};
		
		
		Writer writer = new FileWriter(path);
		
		writer.write(array);
	
		
		writer.close();


		
	}

}
