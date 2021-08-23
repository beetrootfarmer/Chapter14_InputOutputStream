package ch12_1_iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.Writer;
import java.io.Reader;






public class CharacterConvertStreamExample {
	public static String path = "/User/hyeji/Library/temp/test20.txt";
	public static void main(String[] args) throws Exception {
		
		
		write("문자변환 스트림을 사용합니다.");
		String data= read();
		System.out.println(data);
	}
	
//	public static void wirte(String str) throws Exception {
//		FileOutputStream fos = new FileOutputStream(path);
//		Writer writer = new OutputStreamWriter(fos);
//		writer.write(str);
//		writer.flush();
//		writer.close();
//	}
	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream(path);
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer,0,readCharNum);
		
		return data;
	}

	private static void write(String str) throws IOException {
		FileOutputStream fos = new FileOutputStream(path); // 스트림 
		Writer write = new OutputStreamWriter(fos); // 보조스트림
		
		write.write(str);
		write.flush();
		write.close();
		
	}

}
