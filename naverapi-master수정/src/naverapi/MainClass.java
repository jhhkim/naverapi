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
		System.out.println("검색어를 입력하세요.");
		String responseBody = se.next();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("원하는 검색 카테고리의 번호를 입력하세요.");
		System.out.println("1.뉴스 2.블로그 3.책 4.전문자료");
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