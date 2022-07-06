package br.com.benefrancis.estudos.designpatterns.criacionais.singleton;

public final class Singleton {
	
	// O campo deve ser declarado volátil para que a trava de verificação dupla funcione corretamente.
	private static volatile Singleton instance;

	public String value;

	private Singleton(String value) {
		this.value = value;
	}

	public static Singleton getInstance(String value) {

		Singleton result = instance;
		if (result != null) {
			return result;
		}

		// Evitando o problema de corrida
		synchronized (Singleton.class) {
			if (instance == null) {
				instance = new Singleton(value);
			}
			return instance;
		}
	}
}