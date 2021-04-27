package br.com.clubpizzeria.test.reajustesalarial;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.clubpizzeria.funcionario.Funcionario;
import br.com.clubpizzeria.funcionario.desempenho.Desempenho;
import br.com.clubpizzeria.funcionario.reajustesalarial.ReajusteSalarial;

public class ReajusteSalarialTest {

	@Test
	public void reajusteDeveSerTresPorcentoQuandoDesempenhoForADesejar() {
		ReajusteSalarial rs = new ReajusteSalarial();
		Funcionario funcionario = new Funcionario("Vinicius", LocalDate.now(), new BigDecimal("1000"));

		rs.concederReajuste(funcionario, Desempenho.A_DESEJAR);

		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveSerQuinzePorCentoQuandoDesempenhoForBom() {
		ReajusteSalarial rs = new ReajusteSalarial();
		Funcionario funcionario = new Funcionario("Vinicius", LocalDate.now(), new BigDecimal("1000"));

		rs.concederReajuste(funcionario, Desempenho.BOM);

		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveSerVintePorCentoQuandoDesempenhoForOtimo() {
		ReajusteSalarial rs = new ReajusteSalarial();
		Funcionario funcionario = new Funcionario("Vinicius", LocalDate.now(), new BigDecimal("1000"));

		rs.concederReajuste(funcionario, Desempenho.OTIMO);

		assertEquals(new BigDecimal("1300.00"), funcionario.getSalario());
	}

}
