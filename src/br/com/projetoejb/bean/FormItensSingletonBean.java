package br.com.projetoejb.bean;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.projetoejb.ejb.ItensSingletonBean;

@Named
@RequestScoped
public class FormItensSingletonBean implements Serializable {

	private static final long serialVersionUID = -5626164959009765205L;

	@EJB
	private ItensSingletonBean itensSingletonBean;

	public List<String> getItens() {
		return itensSingletonBean.getItens();
	}
}
