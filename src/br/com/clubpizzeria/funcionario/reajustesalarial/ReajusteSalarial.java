package br.com.clubpizzeria.funcionario.reajustesalarial;

import java.math.BigDecimal;

import br.com.clubpizzeria.funcionario.Funcionario;
import br.com.clubpizzeria.funcionario.desempenho.Desempenho;

public class ReajusteSalarial {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		if (desempenho == Desempenho.A_DESEJAR) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03"));
			funcionario.reajustarSalario(reajuste);
		} else if (desempenho == Desempenho.BOM) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.15"));
			funcionario.reajustarSalario(reajuste);
		} else {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.30"));
			funcionario.reajustarSalario(reajuste);
		}

	}

}
