package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtChecadaPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long idChecada;
	private long idCia;
	private long idEmpleado;
	private long idEstacion;
	private LocalDateTime fecha;
	private String tipo;
}