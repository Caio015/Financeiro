package br.com.caio.financeiro.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "receita")
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Receita {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String descricao;
	@NotNull
	private BigDecimal valor;
	@NotNull
	private LocalDate data;
	
	public Receita(@NotNull String descricao, @NotNull BigDecimal valor, @NotNull LocalDate data) {

		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
	}
	
	

}
