package com.vsm.lib.dto.seldb;

import java.time.LocalDateTime;

public class HuCodigoIdentidadDto {
	private long claveCompania;
	private long clavePregunta;
	private String claveRespuesta;	
	private LocalDateTime fechaMov;
	private String obligatorio;
	private String preguntaRespuesta;
	private String status;
	private String userId;
	private String valorDefauld;
	/**
	 * @return the claveCompania
	 */
	public long getClaveCompania() {
		return claveCompania;
	}
	/**
	 * @param claveCompania the claveCompania to set
	 */
	public void setClaveCompania(long claveCompania) {
		this.claveCompania = claveCompania;
	}
	/**
	 * @return the clavePregunta
	 */
	public long getClavePregunta() {
		return clavePregunta;
	}
	/**
	 * @param clavePregunta the clavePregunta to set
	 */
	public void setClavePregunta(long clavePregunta) {
		this.clavePregunta = clavePregunta;
	}
	/**
	 * @return the claveRespuesta
	 */
	public String getClaveRespuesta() {
		return claveRespuesta;
	}
	/**
	 * @param claveRespuesta the claveRespuesta to set
	 */
	public void setClaveRespuesta(String claveRespuesta) {
		this.claveRespuesta = claveRespuesta;
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
	 * @return the obligatorio
	 */
	public String getObligatorio() {
		return obligatorio;
	}
	/**
	 * @param obligatorio the obligatorio to set
	 */
	public void setObligatorio(String obligatorio) {
		this.obligatorio = obligatorio;
	}
	/**
	 * @return the preguntaRespuesta
	 */
	public String getPreguntaRespuesta() {
		return preguntaRespuesta;
	}
	/**
	 * @param preguntaRespuesta the preguntaRespuesta to set
	 */
	public void setPreguntaRespuesta(String preguntaRespuesta) {
		this.preguntaRespuesta = preguntaRespuesta;
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
	/**
	 * @return the valorDefauld
	 */
	public String getValorDefauld() {
		return valorDefauld;
	}
	/**
	 * @param valorDefauld the valorDefauld to set
	 */
	public void setValorDefauld(String valorDefauld) {
		this.valorDefauld = valorDefauld;
	}

	
}
