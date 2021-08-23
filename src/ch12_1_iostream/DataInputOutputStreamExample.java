package ch12_1_iostream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	/**
	 *  DataInputStream이 내가 어떤 자료형을 쓰건 해석해 넣어주는 것
	 *  -Data~ 자료형을 읽어서 비트에 채워준다
	 *  -File~
	 *  
	 *  클래스 객체(dos.write~~ 필드를 규격화)를 만들어서 new객체 생성, 읽어온 데이터 해석, 
	 	스캣통신???
	 	웹에서 들어온 정보 :패킷
	 	들어온 바이너리 데이터를 보면.. 딱 이렇게 되어있어 (16진수 숫자들) ,,이게 바이너리파일
	 	
	 	오오~
	 	
	 	클래스에 담겨있는 정보는 보내고싶을때?
	 	이렇게 나래비를 세워?
	 	정보를 순서대로 저장하고 
	 *
	 */
	
	public static String path = "/Users/heji/Library/Temp/primitive.db";
	
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream(path);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("GilDong"); // UTF로 인코딩해서 넣어줘 
		dos.writeDouble(95.5); // Double로 인코딩해서 넣어줘
		dos.writeInt(1);  //Int로 인코딩해서 넣어줘
		
		dos.writeUTF("BongHwan");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush(); dos.close(); // 밀어서 전달
		
		FileInputStream fis = new FileInputStream(path);
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + ":" + score + ":" +order);
		}
		
		dis.close();
		
	}
}
