package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtEmpleadoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private EtEmpleadoPKDto id;
	private String apMaterno;
	private String apPaterno;
	private String aviso;
	private String estatus;
	private LocalDateTime fechaIngreso;
	private long idZona;
	private String nombre;
}