package criptografia;

public class ValidadorStringBase {

	public boolean validarAlfanumericaMaiusculoMinusculo(String stringBase) {
		return stringBase.matches("[a-zA-Z0-9]*");
	}
	
	public boolean validarSomenteAlfabeticaMaiusculoMinusculo(String stringBase) {
		return stringBase.matches("[a-zA-Z]*");
	}
	
	public boolean validarSomenteNumeros(String stringBase) {
		return stringBase.matches("[0-9]*");
	}
}
