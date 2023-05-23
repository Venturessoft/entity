package com.vsm.lib.dto.checada; 
 
import java.io.Serializable;
import java.util.List;

import com.vsm.lib.dto.etime.EtEmpEstDto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ValidaEstacionHuDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	String codigo;
	String idEstacion;
	String nombreEstacion;
	boolean estacionLibre;
	
	EtEmpEstDto estacionChecada;
	List<String> beacons;
	List<String> estaciones;
}