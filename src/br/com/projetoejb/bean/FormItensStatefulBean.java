package br.com.projetoejb.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.RequestParameterMap;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.projetoejb.ejb.ItensStatefulBean;

@Named
@SessionScoped
public class FormItensStatefulBean implements Serializable {

	private static final long serialVersionUID = -5018296585408463432L;

	@Inject
	@RequestParameterMap
	private Map<String, String> params;

	@EJB
	private ItensStatefulBean itensStatefulBean;

	private String item;

	public List<String> getItens() {
		return itensStatefulBean.getItens();
	}

	public void adicionar(AjaxBehaviorEvent event) {
		itensStatefulBean.adicionarItem(item);
		item = null;
	}

	public void remover(AjaxBehaviorEvent event) {
		String itemToRemove = params.get("itemToRemove");
		itensStatefulBean.removerItem(itemToRemove);
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}
