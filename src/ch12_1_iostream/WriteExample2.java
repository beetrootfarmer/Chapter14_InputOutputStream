package ch12_1_iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {
	
	/*
	 * 
	 * mac에서fileoutStream 사용법... 경로설정 , temp 폴더 위치...
	 * 
	 */

		public static void main(String[] args) throws IOException {
				byte[] array = {10, 20, 30};
				
				String path = "/Users/heji/Library/Temp/test2.db";
				OutputStream os = new FileOutputStream (path);
				
				os.write(array);
				
				
				os.flush();
				os.close();
				
				
		}

	}



