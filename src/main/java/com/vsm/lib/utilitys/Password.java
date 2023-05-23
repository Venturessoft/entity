/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vsm.lib.utilitys;
import java.util.Random;
public class Password { 
	 


	String numeros="0123456789";
	String correspondencia1="abcdefghijklmnñopqrstuvwxyz1234567890 ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	String correspondencia2="ü<\"/Ä\'�?Ê]-ö&?Î)éÂí¿ä~Ó[àù!@_;�?*�?Ô,|>ë{¬û(ò#âË\\Û¡ôÚ+°Ö$îè%}Ü=ê:úï.";	

	/**String correspondencia1="abcdefghijklmnñopqrstuvwxyz1234567890 ";
	String correspondencia2="ü$\"/*'¬°(-ö&?\\){+%¿ä~#[=}!@_;]<ï:,|>ë.";
	String correspondencia1="abcdefghijklmnñopqrstuvwxyz1234567890 ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	String correspondencia2="ü<\"/Ä'�?Ê]-ö&?Î)éÂí¿ä~Ó[àù!@_;�?*�?Ô,|>ë{¬û(ò#âË\\Û¡ôÚ+°Ö$îè%}Ü=ê:úï.";ß225 Ç128 ¢ 189 ^94 ¯238  ¦221 ÷÷246 
	String correspondencia2="üÇß/Ä^�?Ê]-ö&?Î)éÂí¿ä~Ó[àù!@_;�?*�?Ô,|¦ë{¬û(ò#âË¢Û¡ôÚ+°Ö$îè%}Ü=ê:úï¯";
	°|¬!#$%&/()=?¡¿ +~*{ }[]-_.:,;<>@áéíóúäëïöüâêîôû�?É�?ÓÚ´ÄË�?ÖÜÂÊÎÔÛ~ 63 ^` ^ ¨	
    !"#$%&'()*+-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}~¦Ç
    üéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»¦¦¦¦¦�?ÂÀ©¦¦++¢¥++--+-+ãÃ++--¦-+¤ð�?ÊËÈi�?Î�?++¦_¦Ì¯
	ÓßÔÒõÕµþÞÚÛÙý�?¯´­±=¾¶§÷¸°¨·¹³²¦ */		

	String[] posicional= new String[21];
	public Password(){
		// se ponen los valores del arreglo de ordenamiento posicional
		posicional[0]="0";
		posicional[1]="7493162058";
		posicional[2]="5820917364";
		posicional[3]="3795241806";
		posicional[4]="9572068413";
		posicional[5]="6109843752";
		posicional[6]="3781425960";
		posicional[7]="2791064385";
		posicional[8]="8174025396";
		posicional[9]="4196037258";
		posicional[10]="7391024685";
		posicional[11]="9372015468";
		posicional[12]="1583724960";
		posicional[13]="2879501463";
		posicional[14]="3057196248";
		posicional[15]="4132096875";
		posicional[16]="4058263179";
		posicional[17]="9741530268";
		posicional[18]="6314920587";
		posicional[19]="5109283746";
		posicional[20]="8462910357";
	}
	
	public String encripta(String cadena) throws Exception	{ 
	 	int i=0;		
		String aux="";
		String aux2="";
		String aux3="";
		String aux4="";
		// se rellena con espacios a 10 posiciones
		for (i=cadena.length();i<10;i++){
			cadena+=" ";
		}

		// a los numeros se les resta 9 y se mulplican por -1 para obtener el valor absoluto
		for (i=0;i<cadena.length();i++){
			if (numeros.indexOf(cadena.substring(i,i+1))>=0){
				int n=-1*(Integer.parseInt(cadena.substring(i,i+1))-9);
				aux+=String.valueOf(n);
			}else{
				aux+=cadena.substring(i,i+1);
			}
		}
		
		// se convierten los caracteres de acuerdo al arreglo de correspondencias
		for (i=0;i<aux.length();i++){
			int pos=correspondencia1.indexOf(aux.substring(i,i+1));			
			if (pos==-1){
				throw new Exception("El password a encriptar contiene caracteres no validos, los caracteres validos son:"+correspondencia1);
			}
			aux2+=correspondencia2.substring(pos,pos+1);
		}

		//se genera un indice aleatorio
		Random r=new Random();		
		int indice=r.nextInt(20)+1;

		// de acuerdo al indice aleatorio se reordenan las posiciones de la cadena
		for (i=0;i<posicional[indice].length();i++){
			int n=Integer.parseInt(posicional[indice].substring(i,i+1));
			if (n==0){
				n=10;
			}
			aux3+=aux2.substring(n-1,n);
		}
		
		//se encripta el indice obteniendo su correspondencia de acuerdo al arreglo de correspondencias
		String sIndice=String.valueOf(indice);
		for (i=0;i<sIndice.length();i++) {
			int pos=correspondencia1.indexOf(sIndice.substring(i,i+1));			
			aux4+=correspondencia2.substring(pos,pos+1);
		}
		
		// se concatena el password encrpitado + indice encriptado
		aux3+=aux4;
				
		//se regresa el password encriptado
		return aux3.replaceAll("'","''");
	}

	public String desencripta(String cadena) throws Exception{
		int i=0;		
		String aux0="";
		String aux="";
		String aux2="";
		String aux2b="";
		String aux3="";
		String aux4="";
		String sIndice="";
		
		// se separa el indice encriptado del password encriptado
		if (cadena.length()==11){ 
			aux4=cadena.substring(10,11);
		}else if (cadena.length()==12){
			aux4=cadena.substring(10,12);
		}else{
			throw new Exception("La longitud del password es incorrecta ("+cadena.length()+").");
		}		
		aux3=cadena.substring(0,11);
		
		//se desencripta el indice de acuerdo a la cadena de correspondencia
		for (i=0;i<aux4.length();i++){
			int pos=correspondencia2.indexOf(aux4.substring(i,i+1));			
			if (pos==-1){
				throw new Exception("El password a desencriptar contiene caracteres no validos.");
			}
			//System.out.println("pos="+pos);
			sIndice+=correspondencia1.substring(pos,pos+1);
		}
		int indice=Integer.parseInt(sIndice);
		
		// se ordenan las posiciones de acuerdo al arreglo de ordenamiento posicional usando el indice que se desencripto
		for (i=0;i<=9;i++){
			int pos=posicional[indice].indexOf(String.valueOf(i))+1;
			aux2+=aux3.substring(pos-1,pos);
		}

		//aqui se reordena la cadena ya que el proceso anterior dejo la posicion 0 osea la 10 al principio.
		aux2b=aux2.substring(1,aux2.length())+aux2.substring(0,1);

		//se desencriptan los caracteres de acuerdo a la cadena de correspondencia
		for (i=0;i<aux2b.length();i++){
			int pos=correspondencia2.indexOf(aux2b.substring(i,i+1));
			aux+=correspondencia1.substring(pos,pos+1);
		}
		
		//se eliminan los espacios en blanco que pudieran haberse usado para rellenar
		aux=aux.trim();		
		
		//se convierten los numeros con el mismo metodo que se uso para encriptar (restar 9 y tomar el valor absoluto)
		for (i=0;i<aux.length();i++){
			if (numeros.indexOf(aux.substring(i,i+1))>=0){
				int n=-1*(Integer.parseInt(aux.substring(i,i+1))-9);
				aux0+=String.valueOf(n);
			}else{
				aux0+=aux.substring(i,i+1);
			}
		}		
		//se regresa el password desencriptado
		return aux0;		
	}
}