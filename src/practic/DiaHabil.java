package practic;

import java.util.ArrayList;
import java.util.List;

public class DiaHabil {

    public String[] lista = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};

    public String[] getLista() {
        return lista;
    }

    public void setLista(String[] lista) {
        this.lista = lista;
    }

    public void verifica(){
    for(int i =0; i< lista.length; i++){
        System.out.println(i);
    }

    }

}
