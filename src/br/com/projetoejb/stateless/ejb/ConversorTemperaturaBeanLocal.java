package br.com.projetoejb.stateless.ejb;

import javax.ejb.Local;

@Local
public interface ConversorTemperaturaBeanLocal {

	public double converterCelsiusParaFahrenheit(double celsius);
	
}
