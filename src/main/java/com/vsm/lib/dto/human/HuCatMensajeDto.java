package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatMensajeDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCatMensajePKDto id;
	private String claveSoporteDoc;
	private String claveTipoMensaje;
	private LocalDateTime fecha;
	private String mensaje;
	private String status;
	private String sugerencia;
	private String tituloPasoAPaso;
	private String urlPasoAPaso;
	private String userId;
}