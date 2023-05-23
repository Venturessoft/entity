package com.vsm.lib.dto.checada; 
 
import java.io.Serializable;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RegistraChecadaEtInDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	String numeroCompania;
	String empleado;
	String fechaHoraChecada;
	String tipoChecada;
	String foto;
	String prioridad;
	
	Geolocalizacion sGeolocalizacion;
	SBeacons sBeacons;
	SBssids sBssids;
	/**
	 * @return the numeroCompania
	 */
	public String getNumeroCompania() {
		return numeroCompania;
	}
	/**
	 * @param numeroCompania the numeroCompania to set
	 */
	public void setNumeroCompania(String numeroCompania) {
		this.numeroCompania = numeroCompania;
	}
	/**
	 * @return the empleado
	 */
	public String getEmpleado() {
		return empleado;
	}
	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}
	/**
	 * @return the fechaHoraChecada
	 */
	public String getFechaHoraChecada() {
		return fechaHoraChecada;
	}
	/**
	 * @param fechaHoraChecada the fechaHoraChecada to set
	 */
	public void setFechaHoraChecada(String fechaHoraChecada) {
		this.fechaHoraChecada = fechaHoraChecada;
	}
	/**
	 * @return the tipoChecada
	 */
	public String getTipoChecada() {
		return tipoChecada;
	}
	/**
	 * @param tipoChecada the tipoChecada to set
	 */
	public void setTipoChecada(String tipoChecada) {
		this.tipoChecada = tipoChecada;
	}
	/**
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}
	/**
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}
	/**
	 * @return the prioridad
	 */
	public String getPrioridad() {
		return prioridad;
	}
	/**
	 * @param prioridad the prioridad to set
	 */
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	/**
	 * @return the sGeolocalizacion
	 */
	public Geolocalizacion getsGeolocalizacion() {
		return sGeolocalizacion;
	}
	/**
	 * @param sGeolocalizacion the sGeolocalizacion to set
	 */
	public void setsGeolocalizacion(Geolocalizacion sGeolocalizacion) {
		this.sGeolocalizacion = sGeolocalizacion;
	}
	/**
	 * @return the sBeacons
	 */
	public SBeacons getsBeacons() {
		return sBeacons;
	}
	/**
	 * @param sBeacons the sBeacons to set
	 */
	public void setsBeacons(SBeacons sBeacons) {
		this.sBeacons = sBeacons;
	}
	/**
	 * @return the sBssids
	 */
	public SBssids getsBssids() {
		return sBssids;
	}
	/**
	 * @param sBssids the sBssids to set
	 */
	public void setsBssids(SBssids sBssids) {
		this.sBssids = sBssids;
	}	
}