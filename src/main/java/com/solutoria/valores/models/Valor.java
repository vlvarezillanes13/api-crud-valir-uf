package com.solutoria.valores.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="valor")
public class Valor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	@Column(name = "nombreIndicador", length = 50)
	private String nombreIndicador;
	@Column(name = "codigoIndicador", length = 50)
	private String codigoIndicador;
	@Column(name = "unidadMedidaIndicador", length = 50)
	private String unidadMedidaIndicador;
	@Column(name = "valorIndicador")
	private Float valorIndicador;
	@Column(name = "fechaIndicador", length = 50)
	private String fechaIndicador;
}
