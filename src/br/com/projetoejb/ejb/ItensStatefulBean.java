package br.com.projetoejb.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

@Stateful
public class ItensStatefulBean {

	private List<String> itens = new ArrayList<>();
	
	public void adicionarItem(String item) {
		itens.add(item);
		imprimirItens();
	}
	
	public void removerItem(String item) {
		itens.remove(item);
		imprimirItens();
	}
	
	public List<String> getItens() {
		return itens;
	}
	
	private void imprimirItens() {
		System.out.println("Itens cadastrados: " + itens);
	}
}
