package br.com.projetoejb.bean;

import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.projetoejb.ejb.AsynchronousStatelessBean;

@Named
@SessionScoped
public class FormAsynchronousStatelessBean implements Serializable {

	private static final long serialVersionUID = 647097106185961937L;

	@EJB
	private AsynchronousStatelessBean itensBean;

	private String mensagem;

	private Future<Integer> future;

	public String executar() {
		itensBean.processar();
		mensagem = "Processamento iniciado!";
		return null;
	}

	public String executarERetornar() {
		future = itensBean.processarERetornar();
		mensagem = "Processamento iniciado!";
		return null;
	}

	public String verificar() {
		if (!future.isDone()) {
			mensagem = "Execução em andamento";

		} else {
			try {
				mensagem = "Resultado: " + future.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	public String getMensagem() {
		return mensagem;
	}
}
