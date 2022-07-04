package br.com.benefrancis.estudos.designpatterns.criacionais.singleton;

public class DemoMultiThread {

	static boolean ingenuo = false;

	public static void main(String[] args) {

		System.out.println("Se você vir dois valores iguais o singleton funcionou corretamente!");
		System.out.println("Se você vir dois valores diferentes o singleton falhou!");

		Thread threadFoo = new Thread(new ThreadFoo());
		Thread threadBar = new Thread(new ThreadBar());
		threadFoo.start();
		threadBar.start();

	}

	static class ThreadFoo implements Runnable {

		@Override
		public void run() {

			if (ingenuo) {
				SingletonIngenuo singleton = SingletonIngenuo.getInstance("FOO");
				System.out.println(singleton.value);
			} else {
				Singleton singleton = Singleton.getInstance("FOO");
				System.out.println(singleton.value);
			}

		}

	}

	static class ThreadBar implements Runnable {
		@Override
		public void run() {
			if (ingenuo) {
				SingletonIngenuo singleton = SingletonIngenuo.getInstance("BAR");
				System.out.println(singleton.value);
			} else {
				Singleton singleton = Singleton.getInstance("BAR");
				System.out.println(singleton.value);
			}

		}
	}
}