package naverapi;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import dto.NaverApiDto;
import naverapi.NaverAPI;


public class MainClass {

	public static void main(String[] args) {
		
		Scanner se = new Scanner(System.in);
		System.out.println("�˻�� �Է��ϼ���.");
		String responseBody = se.next();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("���ϴ� �˻� ī�װ��� ��ȣ�� �Է��ϼ���.");
		System.out.println("1.���� 2.��α� 3.å 4.�����ڷ�");
		int ca = sc.nextInt();

		
		if (ca==1) {
			NaverAPI.searchNews(responseBody);
//			Gson gson = new Gson();			
//			JsonObject jsonObject = new Gson().fromJson(responseBody, JsonObject.class);
//			JsonArray jsonArray = jsonObject.getAsJsonArray("items");
//			
//			for (JsonElement em : jsonArray) {
//				NaverApiDto dto = gson.fromJson(em, NaverApiDto.class);
//				System.out.println(dto.getTitle());
//				System.out.println(dto.getLink());
//				System.out.println(dto.getPubDate());
//			}
		} else if (ca==2) {
				NaverAPI.searchBlog(responseBody);
		} else if (ca==3) {
				NaverAPI.searchBlog(responseBody);
		} else if (ca==4) {
				NaverAPI.searcDoc(responseBody);
		}


	}

}