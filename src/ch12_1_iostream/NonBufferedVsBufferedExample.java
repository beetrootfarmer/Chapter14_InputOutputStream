package ch12_1_iostream;

import java.io.*;

public class NonBufferedVsBufferedExample {
	public static void main(String[] args) throws Exception{
		
		String originalFilePath1 = 
				NonBufferedVsBufferedExample.class.getResource("originalFile1.jpg").getFile();
				// /Applications/Dev211/Studyjava/Chapter14_InputOutputStream/bin/ch12_1_iostream
		String targetFilePath1 = "/User/hyeji/Library/temp/targetFile1.jpg";
		String targetFilePath2 = "/User/hyeji/Library/temp/targetFile2.jpg";

		
		String originalFilePath2 = 
				NonBufferedVsBufferedExample.class.getResource("originalFile2.jpg").getFile();
	try {
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때\t" + nonBufferTime + "ns");
		
		long BufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때\t" + BufferTime + "ns");
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	
	} catch(IOException ex) {}
	
		
	}
	
	static int data = -1;
	private static FileInputStream is;
	private static FileOutputStream os;

	private static long copy(InputStream fis, OutputStream fos) throws IOException {
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return(end - start);
	}
	

}
