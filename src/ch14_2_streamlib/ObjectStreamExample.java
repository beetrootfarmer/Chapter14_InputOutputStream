package ch14_2_streamlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamExample {
	public static void main(String[] args) throws Exception {
		writeList();
		List<Board> list = readList();
		
		// list를 직렬화
//		util.write();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 파싱해서 가져오는.. 리스트 역직렬화(향상된 for문)
		for(Board b : list) {
			// 순서에 맞춰서 꺼내와야함 
			System.out.printf("%d\t%s\t%s\t%s\t%s\n", 
					b.getBno(), b.getTitle(), b.getContent(), b.getWriter()
					+ sdf.format(b.getDate()));
		}
		
	}
	private static void writeList() throws Exception {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board (1, "제목1", "내용1", "글쓴이1" , new Date()));
		list.add(new Board (2, "제목2", "내용2", "글쓴이2" , new Date()));
		list.add(new Board (3, "제목3", "내용3", "글쓴이3" , new Date()));

		FileOutputStream fos = new FileOutputStream("/Users/heji/Library/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}

	private static List<Board> readList()  throws Exception{
		FileInputStream fis = new FileInputStream("/Users/heji/Library/Temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Board> list = (List<Board>) ois.readObject();
		return list;
	}
	

}
