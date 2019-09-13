package br.com.projetoejb.ejb;

import javax.ejb.Stateless;

@Stateless
public class ConversorTemperaturaStatelessBean implements ConversorTemperaturaLocalStatelessBean {

	@Override
	public double converterCelsiusParaFahrenheit(double celsius) {
		return 9 * (celsius / 5) + 32;
	}

}
