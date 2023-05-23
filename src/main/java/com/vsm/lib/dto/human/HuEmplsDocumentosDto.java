package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsDocumentosDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	HuEmplsDocumentosPKDto id;
	private String userId;
	private LocalDateTime fechaMov;
	private String status;
}