package ch14_2_streamlib;

import java.util.Date;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BoardUtil {
	
	List<Board> list;
	
	public BoardUtil() {
		list = new ArrayList<>();
		
		list.add(new Board(1,"제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2,"제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3,"제목3", "내용3", "글쓴이3", new Date()));
		list.add(new Board(4,"제목4", "내용4", "글쓴이4", new Date()));
		list.add(new Board(5,"제목5", "내용5", "글쓴이5", new Date()));
	}
	
	// Board 클래스 직렬화 serialize
	public void write() {
		String path = "/Users/heji/Library/Temp/boardClass.db";
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// byte배열에 저장 // 바이너리로 만든거야 
			oos.writeObject(list);
			
			oos.flush();
			oos.close();
			
			
		} catch(IOException e) {}
	}
	
	// Board 클래스 역직렬화 deserialize
	public List<Board> read() throws ClassNotFoundException {
		String path = "/Users/heji/Library/Temp/boardClass.db";
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			List<Board> list = (List<Board>)ois.readObject();
			ois.close();

			
		} catch(IOException e) {e.printStackTrace();}
		
		return list;
		
	}

}
