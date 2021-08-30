package view;

import controller.ThreadId;

public class Principal {

	public static void main(String[] args) { //Imprimindo e startando as 5 Threads
		for (int idThread = 0; idThread < 5; idThread++) {
			ThreadId threadId = new ThreadId(idThread);
			threadId.start();
		}

	}

}
