package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuFormatosPantDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuFormatosPantPKDto id;
	private String actualizableKiosco;
	private String boton;
	private String campoBd;
	private LocalDateTime fechaStatus;
	private String nombreBoton;
	private String nombreFormato;
	private String obligatorio;
	private String status;
	private String titulo1;
	private String titulo2;
	private String tituloPantalla;
	private String tooltip;
	private String valorDefault;
	private String visibleKiosco;
}