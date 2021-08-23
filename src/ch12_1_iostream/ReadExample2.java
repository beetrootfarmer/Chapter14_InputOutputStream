package ch12_1_iostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class ReadExample2 {
	public static void main(String[] args) throws IOException {
		
		// 경로 설정
		String path = "/Users/heji/Library/Temp/test2.db"; // 백슬래시는 \\ 두개입력
		// 입력 스트림 열기
		InputStream is = new FileInputStream(path);
		
		// 메모리 만들기
		byte[] buffer = new byte[100]; 
		
		while(true) {
			int readByteNum = is.read(buffer); // buffer는 저장할 객체의 주소 , readByteNum을 리턴 // 배열 길이만큼 읽기
			if(readByteNum == -1) break; // 파일 끝에 도달했을 경우..read는 다 읽으면 -1을 뱉는다
			
			for(int i=0; i<readByteNum; i++) { // 읽은 바이트 수 만큼 반복하면서 저장된 바이트를 출력
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}
}
