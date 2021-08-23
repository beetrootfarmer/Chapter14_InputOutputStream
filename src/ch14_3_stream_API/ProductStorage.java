package ch14_3_stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {
	private List<Product> list = new ArrayList<>();
	
	private Scanner scanner = new Scanner(System.in);
	private int counter;
	
	public void showMenu() {
		while(true) {
			System.out.println("-------------------------");
			System.out.println("1.등록  |  2.목록  |  3.종료");
			System.out.println("-------------------------");
			
			System.out.println("선택: ");
			String selectNo = scanner.nextLine();
			switch(selectNo) {
				case "1" : registerProduct(); break;
				case "2" : showProduct(); break;
				case "3" : return;
			}
		}
	}

	private void registerProduct() {
		try {
			Product product = new Product();
			product.setPno(++counter);
			
			System.out.println("상품명: ");
			product.setName(scanner.nextLine());
			
			System.out.println("가격: ");
			product.setPrice(Integer.parseInt(scanner.nextLine()));
			
			System.out.println("재고: ");
			product.setStock(Integer.parseInt(scanner.nextLine()));
			
			list.add(product);
			
		} catch(Exception e) {
			System.out.println("등록에러: " + e.getMessage());
		}
	}

	private void showProduct() {
		for(Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t 가격" 
								+ p.getPrice() + "\t 재고 " + p.getStock());
			
		}
	}


}