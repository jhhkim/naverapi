package naverapi;

import java.util.ArrayList;
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
		System.out.print("검색어를 입력: ");
		String search = se.next();

		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 검색 카테고리의 번호를 입력하세요.");
		System.out.println("1.뉴스 2.블로그 3.책 4.전문자료");
		System.out.print("번호입력: ");
		int ca = sc.nextInt();
		String responseBody = null;
		ArrayList<NaverApiDto> list = null;
		if (ca == 1) {
			responseBody = NaverAPI.searchNews(search);
			list = NaverAPI.getParsingData(responseBody);
			for (NaverApiDto dto : list) {
				System.out.println("제목: " + dto.getTitle()); 
			}

		} else if (ca == 2) {
//			NaverAPI.searchBlog(responseBody);
		} else if (ca == 3) {
//			NaverAPI.searchBlog(responseBody);
		} else if (ca == 4) {
//			NaverAPI.searcDoc(responseBody);
		}

	}

}