package br.unibratec.fachada;

import br.unibratec.controlador.OperacoesBasicasControlador;
import br.unibratec.controlador.impl.OperacoesBasicasControladorImpl;

/***
 * Fachada implementa as interfaces de negócio
 * @author equipe
 *
 */
public class Fachada implements OperacoesBasicasControlador{

	
	private static Fachada fachada;
	
	private OperacoesBasicasControlador operacoesBasicasControlador;
	
	private Fachada(){
		this.operacoesBasicasControlador = new OperacoesBasicasControladorImpl();
	}
	
	public static Fachada getInstance(){
		if(fachada == null){
			fachada = new Fachada();
		}
		return fachada;
	}
	@Override
	public int soma(int... x) {
		
		return this.operacoesBasicasControlador.soma(x);
	}

	@Override
	public int subtrai(int... x) {

		return this.operacoesBasicasControlador.subtrai(x);
		}

	@Override
	public int multiplica(int... x) {
		return this.operacoesBasicasControlador.multiplica(x);
		
	}

	@Override
	public int divide(int... x) throws Exception {
		return this.operacoesBasicasControlador.divide(x);
		
	}

	
	
	
	
}
