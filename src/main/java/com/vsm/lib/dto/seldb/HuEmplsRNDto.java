package com.vsm.lib.dto.seldb; 
 
import java.time.LocalDateTime;

public interface HuEmplsRNDto {
	long  getNumEmp();
	String getNombreEmp();
	LocalDateTime getFecha();
	LocalDateTime getEntrada();
	LocalDateTime getSalida();
	String getEstacion();
}