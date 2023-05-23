package com.vsm.lib.dto.seldb;

import java.time.LocalDateTime;

public class HuProfesionDto {
	private long numCia;
	private String claveProfesion;	
	private String descripcionProfesion;
	private LocalDateTime fechaMov;
	private String status;
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
	 * @return the descripcionProfesion
	 */
	public String getDescripcionProfesion() {
		return descripcionProfesion;
	}
	/**
	 * @param descripcionProfesion the descripcionProfesion to set
	 */
	public void setDescripcionProfesion(String descripcionProfesion) {
		this.descripcionProfesion = descripcionProfesion;
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
