package com.shinhan.day07;

import com.shinhan.day07.ProductVO;

public class ProductTest {
	public static void main(String[] args) {
		ProductVO[] productList = { new ProductVO("마이쭈", 25000, "Samsong"),
				new ProductVO("꿈틀이", 32000, "Samsong"),
				new ProductVO("짱구", 17050, "Samsong"),
				new ProductVO("새우깡", 24500, "Samsong"),
				new ProductVO("고소미", 75000, "Daehoo") };
		productList = selectProduct(productList, 25000);
		for (int i = 0; i < productList.length; i++) {
			System.out.println(productList[i].toString());
		}
	}

	//Object를 상속받아서 ProductVO를 만들었다.
	private static ProductVO[] selectProduct(Object[] productList, int i) {
		// 구현하시오.
//		for(int k=0;k<=productList.length;k++) {
//			if(productList[i] instanceof ProductVO pro) {
//				if(pro.getPrice()<i)
//			}
//		}
		
		int index =0;
		for(Object obj:productList) {
			//강제 형변환 : 자식타입의 참조변수 = (자식타입) 부모객체 --먼저 자동형변환이 되어있어야함
//			ProductVO product = (ProductVO)obj;
			if(!(obj instanceof ProductVO product)) continue;
			if(product.getPrice()>=i) {
				index++;
			}
		}

		ProductVO[] plist = new ProductVO[index];
		index =0;
		for(Object obj:productList) {
			//강제 형변환 : 자식타입의 참조변수 = (자식타입) 부모객체 --먼저 자동형변환이 되어있어야함
//			ProductVO product = (ProductVO)obj;
			if(!(obj instanceof ProductVO product)) continue;
			if(product.getPrice()>=i) {
				plist[index] = product;
				index++;
			}
		
	}
		return plist;
	}
}
