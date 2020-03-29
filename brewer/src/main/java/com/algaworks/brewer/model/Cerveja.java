package com.algaworks.brewer.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 
 * @author JGaray
 *
 */
@Entity
@Table(name = "cerveja")
public class Cerveja {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotBlank(message = "SKU é obrigatório")
	@Column(name="sky")
	private String sku;
	
	@NotBlank(message = "Nome é obrigatório")
	@Column(name="nome")
	private String nome;
	
	@Size(min = 1, max = 50, message = "O tamanho da descrição deve estar entre 1 e 50")
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="valor")
	private BigDecimal valor;
	
	@Column(name="teor_alcoolico")
	private BigDecimal teorAloolico;
	
	@Column(name="comissao")
	private BigDecimal comissao; 
	
	@Column(name="quantidade_estoque")
	private Integer quantidadeEstoque;
	
	@Enumerated(EnumType.STRING)
	@Column(name="origem")
	private Origem origem;
	
	@Enumerated(EnumType.STRING)
	@Column(name="sabor")
	private Sabor sabor;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public BigDecimal getTeorAloolico() {
		return teorAloolico;
	}
	public void setTeorAloolico(BigDecimal teorAloolico) {
		this.teorAloolico = teorAloolico;
	}
	public BigDecimal getComissao() {
		return comissao;
	}
	public void setComissao(BigDecimal comissao) {
		this.comissao = comissao;
	}
	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public Origem getOrigem() {
		return origem;
	}
	public void setOrigem(Origem origem) {
		this.origem = origem;
	}
	public Sabor getSabor() {
		return sabor;
	}
	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}
	public Estilo getEstilo() {
		return estilo;
	}
	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}
	@ManyToOne
	@JoinColumn(name = "codigo_estilo")
	private Estilo estilo;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
