package com.kjh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Util {
	// ���� ��¥�� ���� ���� �޼ҵ�(yyyy-MM-dd)
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
    
    // ���� �о ȭ�鿡 ���(���� ������ ���� �޼ҵ� ������ ������ �ʹ�)
    public static String readLineFile(String filePath) {
		BufferedReader br = null;
		String retLine = "";
//		StringBuffer sb = new StringBuffer();
		try {
			br = new BufferedReader(new FileReader(filePath));
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				
				retLine += line + "\n";  // ���ڿ��� ����
//				sb.append(line + "\n");
//				System.out.println(line);   // ȭ�鿡 ���
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return retLine;   // sb.toString()
//		return sb.toString(); 
    }
    
    // ���� ����(�����Ϸ� ����, �����)
    public static void writeLineFile(ArrayList<String> strList, String filePath) {
		PrintWriter out = null;
		try {
			out = new PrintWriter(filePath);
	        for(String s : strList) {
	            out.println(s);
	        }
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
    }
    
    // 	���� ����(�̾� ����)
    public static void writeLineFile(ArrayList<String> strList, String filePath, boolean isAppend) {
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileWriter(filePath, isAppend));
	        for(String s : strList) {
	            out.println(s);
	        }
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
    }
    
    // ���� ���� ���ڿ��� �߶� ������ ����
    public static void mySplit(String str, String regex1, String regex2) {
		String[] strArr = str.split(regex1);
		for (String s : strArr) {
//			System.out.println(s);
			String[] tmpArr = s.split(regex2);
//			for (String ss : tmpArr) {
//				System.out.println(ss);
//			}
//			System.out.println(tmpArr.length);
			for (int i = 0; i < tmpArr.length; i++) {
				if (i == tmpArr.length-1) {
					System.out.print(tmpArr[i]);
				} else {
					System.out.print(tmpArr[i] + " / ");
				}
			}
			System.out.println();

		}
    }

}
