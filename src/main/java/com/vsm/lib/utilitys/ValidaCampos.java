package com.vsm.lib.utilitys;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.vsm.lib.dto.human.CamposValidarDto;
import com.vsm.lib.dto.human.HuCatPnemonicoDetDto;
import com.vsm.lib.dto.human.HuCatTablasColumnaDto;
import com.vsm.lib.dto.human.HuCodigoIdentidadDto;
import com.vsm.lib.dto.human.HuFormatosPantDto;

public class ValidaCampos {
	private static final Logger LOG = Logger.getLogger(ValidaCampos.class.getName());
	public ValidaCampos() {}
	
	public String validaLongitud(List<HuCatTablasColumnaDto> catalogo, List<CamposValidarDto> campos) {
		for(CamposValidarDto x : campos) {
			List<HuCatTablasColumnaDto> catTemp = catalogo.stream().filter(p->p.getId().getColumna().equalsIgnoreCase(x.getCampo())).collect(Collectors.toList());
			if(catTemp!=null && catTemp.size()>0) {
				if(x.getValor().length() > catTemp.get(0).getLongitud().longValue()) {
					LOG.info("Error en la longitud del campo: " + x.getCampo());
					return "El valor correspondiente al campo \" " + x.getCampo() + " \" excede la longitud maxima de \" " + catTemp.get(0).getLongitud() + 
						   " \" con  \" " + x.getValor().length() + " \" caracteres";
				}
			}
		}		
        return "ET000";
	}
	
	public String validaMandatorios(List<HuFormatosPantDto> catalogo, List<CamposValidarDto> campos) {
		for(CamposValidarDto x : campos) {
			List<HuFormatosPantDto> catTemp = catalogo.stream().filter(p->p.getCampoBd().equalsIgnoreCase(x.getCampo())).collect(Collectors.toList());
			if(catTemp!=null && catTemp.size()>0) {
				if(x.getValor()==null || x.getValor().isBlank()) {
					LOG.info("Error en el campo: " + x.getCampo() + " no puede ser nulo");
					return "El valor correspondiente al campo \" " + catTemp.get(0).getTituloPantalla() + " \" es obligatorio";
				}
			}
		}		
		return "ET000";
	}
	
	public String validaCodIdentidad(List<HuCodigoIdentidadDto> catalogo, List<CamposValidarDto> campos) { 
		for(CamposValidarDto x : campos) {
			if(x.getCodigoIdentidad() > 0) {
				List<HuCodigoIdentidadDto> catTemp = catalogo.stream().filter(p->p.getId().getClavePregunta() == x.getCodigoIdentidad()).collect(Collectors.toList());
				if(catTemp!=null && catTemp.size()>0) {
					int found=0;
					for(HuCodigoIdentidadDto y : catTemp) {
						if(x.getValor().equalsIgnoreCase(y.getId().getClaveRespuesta())) {
							found ++;						
						}					
					}
					if(found == 0) {
						LOG.info("Error en el campo: " + x.getCampo() + " no existe en el catalogo");
						return "El valor \" " + x.getValor() + " \" correspondiente al Codigo de identidad \" " + x.getCodigoIdentidad() + " \" no existe en los catalogos de Human ";
					}				
					found=0;
				}
			}
		}		
		return "ET000";
	}
	
	public String validaPnemonico(List<HuCatPnemonicoDetDto> catalogo, List<CamposValidarDto> campos) {
		for(CamposValidarDto x : campos) {
			List<HuCatPnemonicoDetDto> catTemp = catalogo.stream().filter(p->p.getId().getCvePnem().equalsIgnoreCase(x.getCampo().replace("TIPO CUENTA2", "TIPO CUENTA")) &&
																			 p.getId().getScvePnem().equalsIgnoreCase(x.getValor())) 					
					  											  	   	   	  .collect(Collectors.toList());
			if(catTemp==null || catTemp.size()<=0) {
				LOG.info("Error en el campo: " + x.getCampo() + " no existe en el catalogo");
				return "La clave \" " + x.getValor() + " \" no corresponde al catalogo \" " + x.getCampo() + " \" ";				
			}
		}		
		return "ET000";
	}
}