package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatDocumentosDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCatDocumentosPKDto id;
	private int orden;
	private String descripcion;
	private String obligatorio;
	private String multiversion;
	private String aplicaCo;
	private String aplicaAt;
	private String aplicaWs;
	private String userId;
	private LocalDateTime fechaMov;
	private String status;
}