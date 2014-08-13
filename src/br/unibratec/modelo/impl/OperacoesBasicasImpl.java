/**
 * 
 */
package br.unibratec.modelo.impl;

import br.unibratec.modelo.OperacoesBasicas;


/**
 * @author equipe
 *
 */
public class OperacoesBasicasImpl implements OperacoesBasicas {

	/* (non-Javadoc)
	 * @see br.unibratec.negocio.OperacoesBasicas#soma(int[])
	 */
	@Override
	public int soma(int... x) {

		int z = 0;
		for (int i : x) {
			z+= i;
		}
		return z;
	}

	/* (non-Javadoc)
	 * @see br.unibratec.negocio.OperacoesBasicas#subtrai(int[])
	 */
	@Override
	public int subtrai(int... x) {

		int z = 0;
		for (int i : x) {
			z-= i;
		}
		return z;

	}

	/* (non-Javadoc)
	 * @see br.unibratec.negocio.OperacoesBasicas#multiplica(int[])
	 */
	@Override
	public int multiplica(int... x) {
		int z = 1;
		for (int i : x) {
			z*= i;
		}
		return z;
	}

	/* (non-Javadoc)
	 * @see br.unibratec.negocio.OperacoesBasicas#divide(int[])
	 */
	@Override
	public int divide(int... x)  {
		int z = 0;
		int count = 0;
		for (int i : x) {
		 count++;
		 if(count == 1){
			 z = i;
		 }else{
			 z = z/i;
		 }
			
		}
		return z;
	}

}
