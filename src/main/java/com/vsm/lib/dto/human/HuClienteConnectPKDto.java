package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuClienteConnectPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private String tipoConexion;
	private String vigencia;
	private LocalDateTime fechaIni;
	private String siglasCliente;
	private String pais;
}