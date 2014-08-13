/**
 * 
 */
package br.unibratec.controlador.impl;

import br.unibratec.controlador.OperacoesBasicasControlador;
import br.unibratec.modelo.OperacoesBasicas;
import br.unibratec.modelo.impl.OperacoesBasicasImpl;

/**
 * @author equipe
 * 
 */
public class OperacoesBasicasControladorImpl implements
		OperacoesBasicasControlador {

	private OperacoesBasicas operacoesBasicas;

	public OperacoesBasicasControladorImpl() {
		this.operacoesBasicas = new OperacoesBasicasImpl();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.unibratec.controlador.OperacoesBasicasControlador#soma(int[])
	 */
	@Override
	public int soma(int... x) {

		return this.operacoesBasicas.soma(x);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.unibratec.controlador.OperacoesBasicasControlador#subtrai(int[])
	 */
	@Override
	public int subtrai(int... x) {
		return this.operacoesBasicas.subtrai(x);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @vsee
	 * br.unibratec.controlador.OperacoesBasicasControlador#multiplica(int[])
	 */
	@Override
	public int multiplica(int... x) {
		return this.operacoesBasicas.multiplica(x);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.unibratec.controlador.OperacoesBasicasControlador#divide(int[])
	 */
	@Override
	public int divide(int... x) throws Exception {

		for (int i : x) {
			if (i == 0) {
				throw new Exception("O valor não pode ser igual a zero!");
			}
		}

		return this.operacoesBasicas.divide(x);
	}

}
