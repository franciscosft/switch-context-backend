package com.context.switche.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class SwitchContext {

	@Id
	public String id;
	public String nome;
	public String origem;
	public String saidaContexto;
	public String entradaContexto;
	public Date data;

	public SwitchContext() {
	}

	public SwitchContext(String nome, String origem, String saidaContexto, String entradaContexto, Date data) {
		super();
		this.nome = nome;
		this.origem = origem;
		this.saidaContexto = saidaContexto;
		this.entradaContexto = entradaContexto;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getSaidaContexto() {
		return saidaContexto;
	}

	public void setSaidaContexto(String saidaContexto) {
		this.saidaContexto = saidaContexto;
	}

	public String getEntradaContexto() {
		return entradaContexto;
	}

	public void setEntradaContexto(String entradaContexto) {
		this.entradaContexto = entradaContexto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "SwitchContext [id=" + id + ", nome=" + nome + ", origem=" + origem + ", saidaContexto=" + saidaContexto
				+ ", entradaContexto=" + entradaContexto + ", data=" + data + "]";
	}
	
	
	
}
