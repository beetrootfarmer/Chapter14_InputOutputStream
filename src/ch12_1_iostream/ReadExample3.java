package ch12_1_iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample3 {
	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("/Users/heji/Library/Temp/test3.db");
		
		byte[] buffer = new byte[10];
		
		// 입력스트림으로부터 3byte를 읽고 buffer[2],[3],[4],에 각각 저장
		int readByteNum = is.read(buffer, 2, 3); // buffer 배열의 2번 인덱스부터 3칸
		if(readByteNum != -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
			
		}
		
		is.close();
	}

}
