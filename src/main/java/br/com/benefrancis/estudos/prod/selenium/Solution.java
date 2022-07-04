package br.com.benefrancis.estudos.prod.selenium;

class Solution {
	public static boolean isTwin(String a, String b) {

		 CharSequence f = b;

		for (int i = 0; i < f.length(); i++) {
	 
			
			if(a.contains(f)) {
				return true;
			}
			
		}
return false;
	}

	public static void main(String[] args) {
		System.out.println(isTwin("Silent", "listen"));
	}
}