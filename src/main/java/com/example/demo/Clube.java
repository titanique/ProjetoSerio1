package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Clube")
public class Clube {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String fundacao;
	
	@OneToMany(fetch=FetchType.EAGER)
	List <Comissao> c;
	
	
	public Clube(String nome, String fundacao) {
		super();
		this.nome = nome;
		this.fundacao = fundacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFundacao() {
		return fundacao;
	}
	public void setFundacao(String fundacao) {
		this.fundacao = fundacao;
	}
	

	
}
