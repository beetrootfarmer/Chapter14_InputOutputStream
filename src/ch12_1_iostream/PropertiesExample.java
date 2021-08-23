package ch12_1_iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws UnsupportedEncodingException {
	/** 
	 *  이걸 샘플로 써놓고 응용해서 써먹어봐요
	 */
		/*
		 * # id=call1212
		 * # 여러줄도 가능합니다.
		 * eng name = hyeJi Kim
		 * kor name = 김혜지
		 * date= 8, 20, 2021, 9, 48
		 * 
		 *  . /User/hyeji/library/temp/.../
		 */
	/** [Properties] 외부 설정파일 읽어오기
	 * 
	 * - '=' 또는 ':'로 연결된 형태여야 한다.
	 * - 주석라인은 첫 번째 문자가 '#'이어야 한다.
	 * - 경로 '/'
	 * 
	 */
		String path = "/Applications/Dev211/Studyjava/Chapter14_InputOutputStream/src/input.text";
		
		Properties settings = new Properties();
		
		try {
			settings.load(new FileInputStream(path));
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			//파일 경로에 파일이 없을 때 
			System.out.println("파일을 찾을 수 없습니다.");
			System.exit(0);
		}
		
		String eName = settings.getProperty("eng_name");
		System.out.println(eName);
		
		String kName = settings.getProperty("kor_name");
		try {
		kName = new String(kName.getBytes("8859_1"), "EUC-KR");
		} catch (UnsupportedEncodingException e) {}
		//  텍스트 파일 utf..바꾸는 것 필요
		
		System.out.println(kName);
		
		String snum = settings.getProperty("data");
		System.out.println(snum);
		
		String[] data = settings.getProperty("data").split(",");
		System.out.println(Arrays.toString(data));
		
		settings.list(System.out);
	}
}
