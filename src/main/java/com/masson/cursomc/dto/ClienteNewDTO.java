package com.masson.cursomc.dto;

import java.io.Serializable;

public class ClienteNewDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private	String email;
	private String CpfOuCnpj;
	private Integer tipo;
	
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	
	private Integer telefone1;
	private Integer telefone2;
	private Integer telefone3;
	
	private Integer cidadeId;

	public ClienteNewDTO() {
		
	}

	public ClienteNewDTO(String nome, String email, String cpfOuCnpj, Integer tipo, String logradouro, String numero,
			String complemento, String bairro, String cep, Integer telefone1, Integer telefone2, Integer telefone3,
			Integer cidadeId) {
		super();
		this.nome = nome;
		this.email = email;
		CpfOuCnpj = cpfOuCnpj;
		this.tipo = tipo;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.telefone3 = telefone3;
		this.cidadeId = cidadeId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfOuCnpj() {
		return CpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		CpfOuCnpj = cpfOuCnpj;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(Integer telefone1) {
		this.telefone1 = telefone1;
	}

	public Integer getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(Integer telefone2) {
		this.telefone2 = telefone2;
	}

	public Integer getTelefone3() {
		return telefone3;
	}

	public void setTelefone3(Integer telefone3) {
		this.telefone3 = telefone3;
	}

	public Integer getCidadeId() {
		return cidadeId;
	}

	public void setCidadeId(Integer cidadeId) {
		this.cidadeId = cidadeId;
	}
	
	
}
