package br.com.casadocodigo.loja.security;

import java.security.MessageDigest;

public class PassGenerator {

	public static void main(String[] args) {
		System.out.println(new PassGenerator().generate("123"));
	}
	
	public String generate(String senhaTexto) {

		try {
			byte[] digest = MessageDigest.getInstance("sha-256").digest(senhaTexto.getBytes());
			//return Base64Encoder.encode(digest);
			return null;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
