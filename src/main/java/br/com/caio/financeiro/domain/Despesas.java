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
import lombok.Getter;
	
@Entity
@Table(name = "despesa")
@Getter
@AllArgsConstructor
	public class Despesas{
		
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@NotNull
		private String descricao;
		@NotNull
		private BigDecimal valor;
		@NotNull
		private LocalDate data;

}


