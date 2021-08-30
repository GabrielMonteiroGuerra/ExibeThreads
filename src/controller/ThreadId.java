package controller;

public class ThreadId extends Thread { //Extendendo a classe para Thread
	
	private int idThread; //Criando a variável local
	
	public ThreadId(int idThread) { //"This" para todas as variáveis
		this.idThread = idThread;
	}

	@Override
	public void run() { //Tudo que estiver dentro do Run será executado
		System.out.println("TID #"+getId()+"===>"+idThread);
	}
	
	

}
