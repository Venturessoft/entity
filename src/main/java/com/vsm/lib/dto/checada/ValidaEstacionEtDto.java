package com.vsm.lib.dto.checada; 
 
import java.io.Serializable;
import java.util.List;

import com.vsm.lib.dto.human.Ta155Dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ValidaEstacionEtDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	String codigo;
	Ta155Dto ta155;
	List<String> beacons;
	List<String> estaciones;
}