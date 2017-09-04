package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Jogador")
@PrimaryKeyJoinColumn(name="id")
public class Jogador extends Comissao {
	
	private int idade;
	private String posicao;

	/*
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	*/
	public Jogador() {
		
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	
	/*public Jogador(String nome, String funcao, double salario) {
		super(nome, funcao, salario);
		// TODO Auto-generated constructor stub
	}   */
	public Jogador(String nome, String funcao, double salario, int idade, String posicao) {
		super(nome, funcao, salario);
		this.idade = idade;
		this.posicao = posicao;
	} 
	
}
