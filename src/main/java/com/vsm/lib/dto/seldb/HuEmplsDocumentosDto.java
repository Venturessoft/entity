package com.vsm.lib.dto.seldb;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class HuEmplsDocumentosDto {

	private long numCia;
	private long numEmp;
	private String claveDocumento;
	private int version;
	private String userId;
	private LocalDateTime fechaMov;
	private String status;

}
