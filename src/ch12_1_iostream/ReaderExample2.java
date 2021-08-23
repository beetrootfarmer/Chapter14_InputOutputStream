package ch12_1_iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample2 {
	public static void main(String[] args) throws IOException{
		String path = "/Users/heji/Library/Temp/test8.txt";
		Reader rd = new FileReader(path);
		
		char[] buffer  = new char[100]; // char 2byte. 200byte 생성 
		
		while (true) {
			int readCharNum = rd.read(buffer);
			System.out.println(readCharNum); // 읽기전, 읽은 후 두번 출력된다. 14, -1
			
			if(readCharNum== -1) break;
			
			for(int i=0; i<readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		rd.close();
	}

}
