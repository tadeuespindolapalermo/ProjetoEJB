package br.com.projetoejb.bean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.projetoejb.ejb.ConversorTemperaturaLocalStatelessBean;

@Named
@RequestScoped
public class FormConversorTemperaturaStatelessBean implements Serializable {

	private static final long serialVersionUID = 8498547499232833205L;

	private Double celsius;
	private Double fahrenheit;

	@EJB
	private ConversorTemperaturaLocalStatelessBean conversor;

	public String converterCelsiusParaFahrenheit() {
		fahrenheit = conversor.converterCelsiusParaFahrenheit(celsius);
		return null;
	}

	public Double getCelsius() {
		return celsius;
	}

	public void setCelsius(Double celsius) {
		this.celsius = celsius;
	}

	public Double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(Double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

}
