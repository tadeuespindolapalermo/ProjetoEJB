package br.com.projetoejb.stateless.bean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.projetoejb.stateless.ejb.ConversorTemperaturaBeanLocal;

@Named("formConversorTemperatura")
@RequestScoped
public class FormConversorTemperaturaBean implements Serializable {

	private static final long serialVersionUID = 8498547499232833205L;

	private Double celsius;
	private Double fahrenheit;

	@EJB
	private ConversorTemperaturaBeanLocal conversor;

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
