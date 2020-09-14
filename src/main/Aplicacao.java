package main;

import criptografia.EmbaralhadorString;
import criptografia.FachadaCriptografia;
import criptografia.MD5Encriptador;
import criptografia.SHA256Encriptador;
import criptografia.SHAEncriptador;

public class Aplicacao {

	public static void main(String[] args) {
		usandoSubsistemaCriptografiaSemFacade();
		usandoSubsistemaCriptografiaComFacade();
	}

	private static void usandoSubsistemaCriptografiaSemFacade() {
		String stringBase = "PP ADS FACADE";
		
		MD5Encriptador md5Encriptador = new MD5Encriptador();
		System.out.println(md5Encriptador.encriptar(stringBase));
		
		SHAEncriptador shaEncriptador = new SHAEncriptador();
		System.out.println(shaEncriptador.encriptar(stringBase));
		
		SHA256Encriptador sha256Encreiptador = new SHA256Encriptador();
		System.out.println(sha256Encreiptador.encriptar(stringBase));
		
		EmbaralhadorString embaralhador = new EmbaralhadorString(stringBase);
		embaralhador.adicionarHorarioDoSistema();
		System.out.println(sha256Encreiptador.encriptar(embaralhador.embaralhar()));
		
		embaralhador.adicionarChaveDeEmbaralhamento("sha256");
		System.out.println(sha256Encreiptador.encriptar(embaralhador.embaralhar()));
		
		
		/* O (TODO FACADE.01) FOI COMPLETADO.
		 * 
		 * 1. Use as classes do subsistema (pacote) criptografia (assuma que elas já existem e você quer utilizá-las, como cliente aqui).
		 * 2. Encripte a stringBase usando o objeto MD5Encriptador e exiba na saida.
		 * 3. Encripte a stringBase usando o objeto SHAEncriptador e exiba na saida.
		 * 4. Encripte a stringBase usando o objeto SHA256Encriptador e exiba na saida.
		 * 5. Embaralhe a stringBase com o objeto EmbaralhadorString somente com horario do sistema. Pegue o resultado e o encripte usando o objeto SHA256Encriptador e exiba na saida.
		 * 6. Embaralhe a stringBase com o objeto EmbaralhadorString com horario do sistema e uma chave de embaralhamento string adicional. Pegue o resultado e o encripte usando o objeto SHA256Encriptador e exiba na saida.
		*/
		
	}
	
	private static void usandoSubsistemaCriptografiaComFacade() {
		String stringBase = "PP ADS FACADE";
		FachadaCriptografia fachada = new FachadaCriptografia(stringBase);
		fachada.encriptarFraco();
		fachada.encriptarMuitissimoForte("sha256");
		
		/*
		 * O(TODO FACADE.02)FOI COMPLETADO. 
		 * 
		 * 1. Assuma que agora vamos usar o subsistema de criptgrafia numa versão mais direta e simplificada.
		 * 2. Para isso, implemente uma FachadaCriptografia, para simplificar o entendimento e uso de
		 * funcionalidades do subsistema de criptografia. Implemente funcionalidades que el simplificara, de acordo com as explicacoes do TODO.FACADE.03. 
		 * 3. Conhecendo e tendo disponivel agora uma FachadaCriptografia, encripte a stringBase 
		 * pedindo-lhe a encriptacao mais fraca e exibindo-a na saida e depois a mais segura. 
		 * 
		 */
		
	}

}
