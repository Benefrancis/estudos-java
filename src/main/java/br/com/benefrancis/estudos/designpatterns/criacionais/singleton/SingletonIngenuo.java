package br.com.benefrancis.estudos.designpatterns.criacionais.singleton;

public final class SingletonIngenuo {

	private static SingletonIngenuo instance;

	public String value;

	private SingletonIngenuo(String value) {
		// Emulando uma pequena lentid�o do sistema, para causar o problema de corrida
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		this.value = value;
	}

	public static SingletonIngenuo getInstance(String value) {
		if (instance == null) {
			instance = new SingletonIngenuo(value);
		}
		return instance;
	}
}