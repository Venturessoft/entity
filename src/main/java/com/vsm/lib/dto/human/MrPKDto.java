package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MrPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long mrCia;
	private long mrNumEmp;
	private LocalDateTime mrFechaApli;
}