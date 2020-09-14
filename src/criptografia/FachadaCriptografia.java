package criptografia;

public class FachadaCriptografia {
	private String text;
	private ValidadorStringBase validador = new ValidadorStringBase();
	private MD5Encriptador md5Encriptador = new MD5Encriptador();
	private SHAEncriptador shaEncriptador = new SHAEncriptador();
	private SHA256Encriptador sha256Ecriptador = new SHA256Encriptador();
	private EmbaralhadorString embaralhardorString;
	
	public FachadaCriptografia(String text) {
		this.text = text;
		embaralhardorString = new EmbaralhadorString(text);
	}
	
	public void encriptarFraco(){
		System.out.println(md5Encriptador.encriptar(this.text));
	}
	
	public void encriptarMedio(){
		System.out.println(shaEncriptador.encriptar(this.text));
	}
	
	public void encriptarForte(){
		System.out.println(sha256Ecriptador.encriptar(this.text));
	}
	
	public void encriptarMuitoForte(){
		embaralhardorString.adicionarHorarioDoSistema();
		System.out.println(sha256Ecriptador.encriptar(embaralhardorString.embaralhar()));
	}
	
	public void encriptarMuitissimoForte(String chave){
		embaralhardorString.adicionarHorarioDoSistema();
		if(!chave.equalsIgnoreCase("sha256")||!chave.equalsIgnoreCase("sha")||
											   			!chave.equals("md5")){
			validador.validarAlfanumericaMaiusculoMinusculo(this.text);
		}
		embaralhardorString.adicionarChaveDeEmbaralhamento(chave);
		System.out.println(sha256Ecriptador.encriptar(embaralhardorString.embaralhar()));
	}
	
	/* O(TODO FACADE.03)FOI COMPLETADO.
	 * 
	 * 1. Verifique se esta fachada deve se compor (referenciar como atributo privado) com objetos UTEIS ao provimento das funcionalidades abaixo.
	 * 2. Implemente esta fachada de modo que o TODO.01.2 seja conhecido como uma funcionalidade
	 * encriptarFraco();
	 * 3. Implemente esta fachada de modo que o TODO.01.3 seja conhecido como uma funcionalidade
	 * encriptarMedio();
	 * 4. Implemente esta fachada de modo que o TODO.01.4 seja conhecido como uma funcionalidade
	 * encriptarForte();
	 * 5. Implemente esta fachada de modo que o TODO.01.5 seja conhecido como uma funcionalidade
	 * encriptarMuitoForte();
	 * 6. Implemente esta fachada de modo que o TODO.01.6 seja conhecido como uma funcionalidade
	 * encriptarMuitissimoForte();
	 * 7. Assuma que se passaram alguns meses depois que finalizamos esta fachada.
	 * Altere encriptarMuitissimoForte() para usar o objeto ValidadorStringBase.validarAlfanumericaMaiusculoMinusculo() antes de encriptar.
	 * 8. Assuma que se passaram alguns meses depois que finalizamos esta fachada.
	 * 9. Adicione nesta fachada uma nova funcionalidade encriptarMuitissimoForte(), que considera a execução de validacao ou não
	 * que usaria um objeto ValidadorStringBase.validarAlfanumericaMaiusculoMinusculo() antes de encriptar, dependendo da parametrizacao.
	 */
	
}
