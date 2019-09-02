package br.com.projetoejb.stateless.ejb;

import javax.ejb.Stateless;

@Stateless
public class ConversorTemperaturaBean implements ConversorTemperaturaBeanLocal {

	@Override
	public double converterCelsiusParaFahrenheit(double celsius) {
		return 9 * (celsius / 5) + 32;
	}

}
