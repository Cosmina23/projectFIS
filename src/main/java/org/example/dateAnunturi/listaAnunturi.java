package org.example.dateAnunturi;

import java.util.ArrayList;

public class listaAnunturi {
    private ArrayList<Anunt> anunturi;

    public  listaAnunturi(){
        anunturi = new ArrayList<>();
    }

    public String toString(){
        String r = "";
        for(Anunt aux :  anunturi){
            r+=aux+"\n"+"\n";
        }
        return r;
    }
    private void adaugaAnunt(String dp, String di, String c) {
        Anunt a = new Anunt(c,dp,di);
        anunturi.add(a);
    }

}
