package com.vsm.lib.dto.checada; 
 
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConsultaEmpleadoOutDto implements Serializable { 
	private static final long serialVersionUID = 1L; 
	
	String codigo;
	String nombre;
	String numeroCompania;	
	String foto;
	String fechaFoto;	
	List<Map<String,String>> beacons;
}