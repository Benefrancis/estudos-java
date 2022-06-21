package br.com.benefrancis.stream;

public class Catalan {

	int catalan(Long n) {

		int res = 0;

		// Base case
		if (n <= 1) {
			return 1;
		}
		for (Long i = 0l; i < n; i++) {
			res += catalan(i) * catalan(n - i - 1);
		}
		return res;
	}

	public static void main(String[] args) {
		Catalan cn = new Catalan();
		for (Long i = 0l; i < 10; i++) {
			System.out.print(cn.catalan(i) + " ");
		}

//	fatorial(2n)/fatorial(n+1)*fatorial(n)

	}
}
