package com.vsm.lib.dto.seldb;

import java.time.LocalDateTime;

public class HuEscPuestoDto {
	private long numCia;
	private String claveDelPuesto;
	private long claveNivelEsc;
	private String claveProfesion;
	private LocalDateTime fechaMov;
	private String gradoAcademico;
	private String status;
	private String tipoRequerido;
	private String userId;
	/**
	 * @return the numCia
	 */
	public long getNumCia() {
		return numCia;
	}
	/**
	 * @param numCia the numCia to set
	 */
	public void setNumCia(long numCia) {
		this.numCia = numCia;
	}
	/**
	 * @return the claveDelPuesto
	 */
	public String getClaveDelPuesto() {
		return claveDelPuesto;
	}
	/**
	 * @param claveDelPuesto the claveDelPuesto to set
	 */
	public void setClaveDelPuesto(String claveDelPuesto) {
		this.claveDelPuesto = claveDelPuesto;
	}
	/**
	 * @return the claveNivelEsc
	 */
	public long getClaveNivelEsc() {
		return claveNivelEsc;
	}
	/**
	 * @param claveNivelEsc the claveNivelEsc to set
	 */
	public void setClaveNivelEsc(long claveNivelEsc) {
		this.claveNivelEsc = claveNivelEsc;
	}
	/**
	 * @return the claveProfesion
	 */
	public String getClaveProfesion() {
		return claveProfesion;
	}
	/**
	 * @param claveProfesion the claveProfesion to set
	 */
	public void setClaveProfesion(String claveProfesion) {
		this.claveProfesion = claveProfesion;
	}
	/**
	 * @return the fechaMov
	 */
	public LocalDateTime getFechaMov() {
		return fechaMov;
	}
	/**
	 * @param fechaMov the fechaMov to set
	 */
	public void setFechaMov(LocalDateTime fechaMov) {
		this.fechaMov = fechaMov;
	}
	/**
	 * @return the gradoAcademico
	 */
	public String getGradoAcademico() {
		return gradoAcademico;
	}
	/**
	 * @param gradoAcademico the gradoAcademico to set
	 */
	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the tipoRequerido
	 */
	public String getTipoRequerido() {
		return tipoRequerido;
	}
	/**
	 * @param tipoRequerido the tipoRequerido to set
	 */
	public void setTipoRequerido(String tipoRequerido) {
		this.tipoRequerido = tipoRequerido;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
