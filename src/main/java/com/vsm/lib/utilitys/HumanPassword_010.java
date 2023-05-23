package com.vsm.lib.utilitys;

import java.util.Random;

public class HumanPassword_010 {
    String universo[];
    String encabezado[];
    long ll_indice, ll_Doubleitud, ll_columns, ll_orden[], ll_numero;
    String ls_dato_ind1, ls_dato_ind2, ls_password, ls_caracteres[], ls_columna, ls_dato;
    String ls_indice[], ls_columnas[];
    String numeros = "0123456789";
    String correspondencia1 = "abcdefghijklmn�opqrstuvwxyz1234567890 ABCDEFGHIJKLMN�OPQRSTUVWXYZ";
    String correspondencia2 = "�<\"/�'��]-�&?�)����~�[��!@_;�*��,|>�{��(�#��\\ۡ��+��$��%}�=�:��.";
    String[] posicional = new String[21];
    
    public HumanPassword_010() {
    	ls_caracteres = new String[20];
        ls_indice = new String[20];
        ll_orden = new long[11];
        ls_columnas = new String[10];
        encabezado = new String[79];
        universo = new String[79];
        //------------ Inicialisacion del Arreglo de indices para el ordenamiento
        ls_indice[0] = "7493162058ABCDEF";
        ls_indice[1] = "5820917364BCFDAE";
        ls_indice[2] = "3795241806AFECBD";
        ls_indice[3] = "9572068413CEABDF";
        ls_indice[4] = "6109843752FABECD";
        ls_indice[5] = "3781425960ACFDEB";
        ls_indice[6] = "2791064385BFEACD";
        ls_indice[7] = "8174025396EACFDB";
        ls_indice[8] = "4196037258DCFBAE";
        ls_indice[9] = "7391024685BACEFD";
        ls_indice[10] = "9372015468FABEDC";
        ls_indice[11] = "1583724960CAFEBD";
        ls_indice[12] = "2879501463DEBFAC";
        ls_indice[13] = "3057196248FEDCAB";
        ls_indice[14] = "4132096875ECAFBD";
        ls_indice[15] = "4058263179DECBAF";
        ls_indice[16] = "9741530268FBADCE";
        ls_indice[17] = "6314920587CBAFED";
        ls_indice[18] = "5109283746DFABCE";
        ls_indice[19] = "8462910357EFBACD";
        ls_columnas[0] = "uno";
        ls_columnas[1] = "dos";
        ls_columnas[2] = "tres";
        ls_columnas[3] = "cuatro";
        ls_columnas[4] = "cinco";
        ls_columnas[5] = "seis";
        ls_columnas[6] = "siete";
        ls_columnas[7] = "ocho";
        ls_columnas[8] = "nueve";
        ls_columnas[9] = "cero";
    }

    private boolean GetMapa() {
        int row = 0;
        universo[row++] = "ü";
        universo[row++] = "<";
        universo[row++] = ((char)34 )+"";
        universo[row++] = "/";
        universo[row++] = "Ä";
        universo[row++] = "'";
        universo[row++] = "Í";
        universo[row++] = "Ê";
        universo[row++] = "]";
        universo[row++] = "-";
        universo[row++] = "ö";
        universo[row++] = "&";
        universo[row++] = "?";
        universo[row++] = "Î";
        universo[row++] = ")";
        universo[row++] = "é";        
        universo[row++] = "Â";
        universo[row++] = "í";
        universo[row++] = "¿";
        universo[row++] = "ä";
        universo[row++] = "~";
        universo[row++] = "Ó";
        universo[row++] = "[";
        universo[row++] = "à";
        universo[row++] = "ù";
        universo[row++] = "!";
        universo[row++] = "@";
        universo[row++] = "_";
        universo[row++] = ";";
        universo[row++] = "Á";
        universo[row++] = "*";
        universo[row++] = "Ï";
        universo[row++] = "Ô";
        universo[row++] = ",";
        universo[row++] = "|";
        universo[row++] = ">";
        universo[row++] = "ë";
        universo[row++] = "{";
        universo[row++] = "¬";
        universo[row++] = "û";
        universo[row++] = "(";
        universo[row++] = "ò";
        universo[row++] = "#";
        universo[row++] = "â";
        universo[row++] = "Ë";
        universo[row++] = "\\";
        universo[row++] = "Û";
        universo[row++] = "¡";
        universo[row++] = "ô";
        universo[row++] = "Ú";
        universo[row++] = "+";
        universo[row++] = "°";
        universo[row++] = "Ö";
        universo[row++] = "$";
        universo[row++] = "î";
        universo[row++] = "è";
        universo[row++] = "%";
        universo[row++] = "}";
        universo[row++] = "Ü";
        universo[row++] = "=";
        universo[row++] = "ê";
        universo[row++] = ":";
        universo[row++] = "ú";
        universo[row++] = "ï";
        universo[row++] = ".";
        universo[row++] = "µ";
        universo[row++] = "þ";
        universo[row++] = "Ý";
        universo[row++] = "ß";
        universo[row++] = "õ";
        universo[row++] = "»";
        universo[row++] = "Þ";
        universo[row++] = "«";
        universo[row++] = "ð";
        universo[row++] = "±";
        universo[row++] = "Õ";
        universo[row++] = "Ð";
        universo[row++] = "÷";
        universo[row++] = "ý";
        row = 0;
        encabezado[row++] = "a";
        encabezado[row++] = "b";
        encabezado[row++] = "c";
        encabezado[row++] = "d";
        encabezado[row++] = "e";
        encabezado[row++] = "f";
        encabezado[row++] = "g";
        encabezado[row++] = "h";
        encabezado[row++] = "i";
        encabezado[row++] = "j";
        encabezado[row++] = "k";
        encabezado[row++] = "l";
        encabezado[row++] = "m";
        encabezado[row++] = "n";
        encabezado[row++] = "ñ";
        encabezado[row++] = "o";
        encabezado[row++] = "p";
        encabezado[row++] = "q";
        encabezado[row++] = "r";
        encabezado[row++] = "s";
        encabezado[row++] = "t";
        encabezado[row++] = "u";
        encabezado[row++] = "v";
        encabezado[row++] = "w";
        encabezado[row++] = "x";
        encabezado[row++] = "y";
        encabezado[row++] = "z";
        encabezado[row++] = "uno";
        encabezado[row++] = "dos";
        encabezado[row++] = "tres";
        encabezado[row++] = "cuatro";
        encabezado[row++] = "cinco";
        encabezado[row++] = "seis";
        encabezado[row++] = "siete";
        encabezado[row++] = "ocho";
        encabezado[row++] = "nueve";
        encabezado[row++] = "cero";
        encabezado[row++] = "espacio";
        encabezado[row++] = "ma";
        encabezado[row++] = "mb";
        encabezado[row++] = "mc";
        encabezado[row++] = "md";
        encabezado[row++] = "me";
        encabezado[row++] = "mf";
        encabezado[row++] = "mg";
        encabezado[row++] = "mh";
        encabezado[row++] = "mi";
        encabezado[row++] = "mj";
        encabezado[row++] = "mk";
        encabezado[row++] = "ml";
        encabezado[row++] = "mm";
        encabezado[row++] = "mn";
        encabezado[row++] = "nn";
        encabezado[row++] = "mo";
        encabezado[row++] = "mp";
        encabezado[row++] = "mq";
        encabezado[row++] = "mr";
        encabezado[row++] = "ms";
        encabezado[row++] = "mt";
        encabezado[row++] = "mu";
        encabezado[row++] = "mv";
        encabezado[row++] = "mw";
        encabezado[row++] = "mx";
        encabezado[row++] = "my";
        encabezado[row++] = "mz";
        encabezado[row++] = "la";
        encabezado[row++] = "lb";
        encabezado[row++] = "lc";
        encabezado[row++] = "ld";
        encabezado[row++] = "le";
        encabezado[row++] = "lf";
        encabezado[row++] = "lg";
        encabezado[row++] = "lh";
        encabezado[row++] = "li";
        encabezado[row++] = "lj";
        encabezado[row++] = "lk";
        encabezado[row++] = "ll";
        encabezado[row++] = "lm";
        encabezado[row++] = "ln";
        return true;
    }

    private boolean isNumber(String v) {
    	try {
            Integer.parseInt(v);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public String decryp(String pass) {
        String ls_var;        
        ls_password = pass;
        GetMapa();
        ll_Doubleitud = (ls_password.length());
        if (ll_Doubleitud == 18 || ll_Doubleitud == 12) {
            ls_dato_ind1 = ls_password.substring((int) (ll_Doubleitud - 2), (int) (ll_Doubleitud - 2) + 1);
            ls_dato_ind2 = ls_password.substring((int) ll_Doubleitud - 1, (int) (ll_Doubleitud - 1) + 1);
            ll_columns = universo.length;
            for (int i = 0; i < universo.length; i++) {
                if (universo[i].equals(ls_dato_ind1)) {
                    ls_dato_ind1 = encabezado[i];
                }
                if (universo[i].equals(ls_dato_ind2)) {
                    ls_dato_ind2 = encabezado[i];
                }
            }
            for (int i = 0; i < ls_columnas.length; i++) {
                if (ls_columnas[i].equals(ls_dato_ind1)) {
                    ls_dato_ind1 = "" + (i + 1);
                    if ("10".equals(ls_dato_ind1)) {
                        ls_dato_ind1 = "0";
                    }
                }
                if (ls_columnas[i].equals(ls_dato_ind2)) {
                    ls_dato_ind2 = "" + (i + 1);
                    if ("10".equals(ls_dato_ind2)) {
                        ls_dato_ind2 = "0";
                    }
                }
            }
            ls_dato_ind1 = ls_dato_ind1 + ls_dato_ind2;
            ll_indice = Integer.parseInt(ls_dato_ind1);
            ll_indice = ll_indice - 1;
        } else if (ll_Doubleitud == 17 || ll_Doubleitud == 11 || ll_Doubleitud == 13) {
            ls_dato_ind1 = ls_password.substring((int) ll_Doubleitud - 1, (int) (ll_Doubleitud - 1) + 1);
            ll_columns = universo.length;
            for (int i = 0; i < ll_columns; i++) {
                if (universo[i].equals(ls_dato_ind1)) {
                    ls_dato_ind1 = encabezado[i];
                }
            }
            for (int i = 0; i < ll_columns; i++) {
                if (ls_columnas[i].equals(ls_dato_ind1)) {
                    ll_indice = i;
                    break;
                }
            }
        } else {
            return "-1";
        }

        if (ll_indice >= 9) {
            ll_Doubleitud = ll_Doubleitud - 2;
        } else {
            ll_Doubleitud--;
        }
        //------------ Se acomoda el indice de ordenamiento en un arreglo 
        ll_orden = new long[(int)ll_Doubleitud + 1];
        for (int i = 0; i < ll_Doubleitud; i++) {
            ls_var = (ls_indice[(int) ll_indice]).substring(i, i + 1);
            if (isNumber(ls_var)) {
                String v = (ls_indice[(int) ll_indice]).substring(i, i + 1);
                ll_orden[i] = Long.parseLong(v);
                if (ll_orden[i] == 0) {
                    ll_orden[i] = 10;
                }
            } else {
                if ("A".equals(ls_var)) {
                    ll_orden[i] = 11;
                } else if ("B".equals(ls_var)) {
                    ll_orden[i] = 12;
                } else if ("C".equals(ls_var)) {
                    ll_orden[i] = 13;
                } else if ("D".equals(ls_var)) { 
                    ll_orden[i] = 14;
                } else if ("E".equals(ls_var)) {
                    ll_orden[i] = 15;
                } else if ("F".equals(ls_var)) {
                    ll_orden[i] = 16;
                }
            }
        }
        ls_caracteres = new String[(int) ll_Doubleitud];
        for (int i = 0; i < ll_Doubleitud; i++) {
            ll_indice = ll_orden[(int) i];
            if (ll_indice == 0) { 
                    ll_indice= 10;
                }
            if (i == ls_password.length()-1){
                ls_caracteres[(int) ll_indice - 1] = ls_password.substring((int) i, i);
            }else{
                ls_caracteres[(int) ll_indice - 1] = ls_password.substring((int) i, (int) (i) + 1);
            }            
        }
        //------------ Leer la correspondencia del dw y convertir los numeros en letra para poder leer del ds
        //------------		Solo cuando no reciva el password codificado
        ll_columns = universo.length;
        for (int i = 0; i < ls_caracteres.length; i++) {
            for (int j = 0; j < universo.length; j++) {
                if (universo[j].equals(ls_caracteres[i])) {
                    ls_dato_ind1 = encabezado[j];
                    ls_caracteres[i] = ls_dato_ind1;
                    if (ls_caracteres[i].length() > 1) {
                        if ("uno".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "1";
                        }
                        if ("dos".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "2";
                        }
                        if ("tres".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "3";
                        }
                        if ("cuatro".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "4";
                        }
                        if ("cinco".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "5";
                        }
                        if ("seis".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "6";
                        }
                        if ("siete".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "7";
                        }
                        if ("ocho".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "8";
                        }
                        if ("nueve".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "9";
                        }
                        if ("cero".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "0";
                        }
                        if ("espacio".equals(ls_caracteres[i])) { 
                            ls_caracteres[i] = " ";
                        }
                        if ("la".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "!";
                        }
                        if ("lb".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "@";
                        }
                        if ("lc".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "#";
                        }
                        if ("ld".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "$";
                        }
                        if ("le".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "%";
                        }
                        if ("lf".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "*";
                        }
                        if ("lg".equals(ls_caracteres[i])) { 
                            ls_caracteres[i] = "|";
                        }
                        if ("lh".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "\\";
                        }
                        if ("li".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "(";
                        }
                        if ("lj".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = ")";
                        }
                        if ("lk".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "_";
                        }
                        if ("ll".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "-";
                        }
                        if ("lm".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "[";
                        }
                        if ("ln".equals(ls_caracteres[i])) {
                            ls_caracteres[i] = "]";
                        }
                        if (ls_caracteres[i].equals("ma")
                                || ls_caracteres[i].equals("mb") || ls_caracteres[i].equals("mc")
                                || ls_caracteres[i].equals("md") || ls_caracteres[i].equals("me")
                                || ls_caracteres[i].equals("mf") || ls_caracteres[i].equals("mg")
                                || ls_caracteres[i].equals("mh") || ls_caracteres[i].equals("mi")
                                || ls_caracteres[i].equals("mj") || ls_caracteres[i].equals("mk")
                                || ls_caracteres[i].equals("ml") || ls_caracteres[i].equals("mm")
                                || ls_caracteres[i].equals("mn") || ls_caracteres[i].equals("mo")
                                || ls_caracteres[i].equals("mp") || ls_caracteres[i].equals("mq")
                                || ls_caracteres[i].equals("mr") || ls_caracteres[i].equals("ms")
                                || ls_caracteres[i].equals("mt") || ls_caracteres[i].equals("mu")
                                || ls_caracteres[i].equals("mv") || ls_caracteres[i].equals("mw")
                                || ls_caracteres[i].equals("mx") || ls_caracteres[i].equals("my")
                                || ls_caracteres[i].equals("mz")) {
                            ls_caracteres[i] = (ls_caracteres[i].substring(1).toUpperCase());
                        }
                    }
                }
            }
        }
        //------------ A cada numero contenido en la cadena de password se le resta nueve y se toma el absoluto
        for (int i = 0; i < ls_caracteres.length; i++) {
            if (isNumber(ls_caracteres[i])) {
                ll_numero = Long.parseLong(ls_caracteres[i]);
                ll_numero = ll_numero - 9;
                ll_numero = Math.abs(ll_numero);
                ls_caracteres[i] = "" + (ll_numero);
            }
        }
        ls_password = "";
        for (int i = 0; i < ls_caracteres.length; i++) {
            ls_password = ls_password + "" + (ls_caracteres[i]);
        }
        ls_password = ls_password.replace(" ","");
        return ls_password.trim();        
    }

    public String encripta(String cadena) throws Exception {
        int i = 0;
        String aux = "";
        String aux2 = "";
        String aux3 = "";
        String aux4 = "";

        //se rellena con espacios a 10 posiciones
        for (i = cadena.length(); i < 10; i++) {
            cadena = cadena + " ";
        }

        //a los numeros se les resta 9 y se mulplican por -1 para obtener el valor absoluto
        for (i = 0; i < cadena.length(); i++) {
            if (this.numeros.indexOf(cadena.substring(i, i + 1)) >= 0) {
                int n = -1 * (Integer.parseInt(cadena.substring(i, i + 1)) - 9);
                aux = aux + String.valueOf(n);
            } else {
                aux = aux + cadena.substring(i, i + 1);
            }
        }

        //se convierten los caracteres de acuerdo al arreglo de correspondencias
        for (i = 0; i < aux.length(); i++) {
            int pos = this.correspondencia1.indexOf(aux.substring(i, i + 1));
            if (pos == -1) { 
                throw new Exception("El password a encriptar contiene caracteres no validos, los caracteres validos son:" + this.correspondencia1);
            }
            aux2 = aux2 + this.correspondencia2.substring(pos, pos + 1);
        }

        //se genera un indice aleatorio
        Random r = new Random();
        int indice = r.nextInt(20) + 1;

        // de acuerdo al indice aleatorio se reordenan las posiciones de la cadena
        for (i = 0; i < this.posicional[indice].length(); i++) {
            int n = Integer.parseInt(this.posicional[indice].substring(i, i + 1));
            if (n == 0) {
                n = 10;
            }
            aux3 = aux3 + aux2.substring(n - 1, n);
        }

        //se encripta el indice obteniendo su correspondencia de acuerdo al arreglo de correspondencias
        String sIndice = String.valueOf(indice);
        for (i = 0; i < sIndice.length(); i++) {
            int pos = this.correspondencia1.indexOf(sIndice.substring(i, i + 1));
            aux4 = aux4 + this.correspondencia2.substring(pos, pos + 1);
        }

        // se concatena el password encrpitado + indice encriptado
        aux3 = aux3 + aux4;

        //se regresa el password encriptado
        return aux3.replaceAll("'", "''");
    }

    public String desencripta(String cadena) throws Exception {
    	return decryp(cadena);
    }
}