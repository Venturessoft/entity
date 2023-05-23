package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatPnemonicoDetDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCatPnemonicoDetPKDto id;
	private String aplicaMerito;
	private String bancoOrigen;
	private String clavePagoSat;
	private String cuentaOrigen;
	private String descripcion;
	private LocalDateTime fechaMov;
	private String status;
	private String sucursalOrigen;
	private String tipoSeparacion;
	private String userId;
	private String validaNss;
}