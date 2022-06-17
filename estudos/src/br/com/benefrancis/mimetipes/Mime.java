package br.com.benefrancis.mimetipes;

import java.util.HashMap;
import java.util.Scanner;

public class Mime {

	private static final String UNKNOWN = "UNKNOWN";
	private static final String DOT = ".";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int mimeTypeCount = in.nextInt();
		int lineCount = in.nextInt();

		HashMap<String, String> mimeMap = new HashMap<>((int) (mimeTypeCount * 1.3));

		for (int i = 0; i < mimeTypeCount; i++) {
			String ext = in.next();
			String mt = in.next();
			mimeMap.put(ext.toUpperCase(), mt);
		}

		in.nextLine();

		for (int i = 0; i < lineCount; i++) {
			String fileName = in.next();

			int lastIndexOfDot = fileName.lastIndexOf(DOT);

			if (lastIndexOfDot == -1) {
				System.out.println(UNKNOWN);
				continue;
			}

			String ext = fileName.substring(lastIndexOfDot + 1, fileName.length()).toUpperCase();
			String mimeType = mimeMap.get(ext);

			if (mimeType == null) {
				System.out.println(UNKNOWN);
				continue;
			}
			System.out.println(mimeType);
		}
		in.close();
	}
}
