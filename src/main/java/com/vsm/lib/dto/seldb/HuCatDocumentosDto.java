package com.vsm.lib.dto.seldb;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class HuCatDocumentosDto {
	private long numCia;
	private String claveDocumento;
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
