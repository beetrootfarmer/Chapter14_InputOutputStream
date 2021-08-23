package ch12_1_iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
	public static void main(String[] args) throws IOException{
		String path = "/Users/heji/Library/Temp/test7.txt";
		Reader rd = new FileReader(path);
		
		while (true) {
			int data = rd.read();
			if(data== -1) break;
			
			System.out.println((char)data);
		}
		
	}

}
