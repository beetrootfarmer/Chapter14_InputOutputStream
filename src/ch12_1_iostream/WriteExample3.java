package ch12_1_iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample3 {
	
	/*
	 * 
	 * mac에서fileoutStream 사용법... 경로설정 , temp 폴더 위치...
	 * 
	 */

		public static void main(String[] args) throws IOException {
				byte[] array = {10, 20, 30, 40, 50};
				
				String path = "/Users/heji/Library/Temp/test3.db"; ///Users/heji/Library
				OutputStream os = new FileOutputStream (path);
				
				os.write(array, 1, 3);
				
				
				os.flush();
				os.close();
				
				
		}

	}



