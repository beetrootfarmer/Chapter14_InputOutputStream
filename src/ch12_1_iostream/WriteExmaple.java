package ch12_1_iostream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExmaple {
	public static void main(String[] args) throws IOException {
	
			byte a = 10;
			byte b = 20;
			byte c = 23;
			
//			String path = "Applications/Temp/test1.db";
			OutputStream os = new FileOutputStream ("/Users/heji/Library/Temp/test1.db");
			
			os.write(b);
			os.write(b);
			os.write(c);

			
			os.flush();
			os.write(c);
			os.close();
			
			
	}

}
