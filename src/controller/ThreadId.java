package controller;

public class ThreadId extends Thread { //Extendendo a classe para Thread
	
	private int idThread; //Criando a vari�vel local
	
	public ThreadId(int idThread) { //"This" para todas as vari�veis
		this.idThread = idThread;
	}

	@Override
	public void run() { //Tudo que estiver dentro do Run ser� executado
		System.out.println("TID #"+getId()+"===>"+idThread);
	}
	
	

}
