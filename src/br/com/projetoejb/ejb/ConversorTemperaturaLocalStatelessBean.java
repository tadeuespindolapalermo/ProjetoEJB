package br.com.projetoejb.ejb;

import javax.ejb.Local;

@Local
public interface ConversorTemperaturaLocalStatelessBean {

	public double converterCelsiusParaFahrenheit(double celsius);
	
}
