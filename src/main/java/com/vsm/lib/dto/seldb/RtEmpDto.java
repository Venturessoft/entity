package com.vsm.lib.dto.seldb; 
 
import java.time.LocalDateTime;

public interface RtEmpDto {
	LocalDateTime getFechaMov();
	String getRtArea();
	String getRtCentro();
	String getRtLinea();
	long getNumEmp();
	String getApellPat();
	String getApellMat();
	String getNombre();
	String getArea();
	String getCentro();
	String getLinea();
	String getRtCategoria();
	LocalDateTime getRtHoraEnt();
	LocalDateTime getRtHoraSal();
}