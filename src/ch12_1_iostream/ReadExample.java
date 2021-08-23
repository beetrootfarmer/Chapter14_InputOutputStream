package ch12_1_iostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class ReadExample {
	public static void main(String[] args) throws IOException {
		
		// 경로 설정
		String path = "/Users/heji/Library/Temp/test1.db"; // 백슬래시는 \\ 두개입력
		
		// 입력 스트림 열기
		InputStream is = new FileInputStream(path);
		
		while(true) {
			int data = is.read();
			if(data == -1) break;
			System.out.println(data);
		}
		
		is.close();
		
	}

}
