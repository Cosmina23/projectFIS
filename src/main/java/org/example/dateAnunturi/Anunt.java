package org.example.dateAnunturi;

public class Anunt {
    private String continut;
    private String dataPublicare, dataIncheiere;

    public Anunt(String c, String datep, String datei){
        continut = c;
        dataPublicare = datep;
        dataIncheiere = datei;
    }

    public String toString(){
        String r = "";
        r += dataPublicare + " -> "+ dataIncheiere + "\n"+continut;
        return r;
    }
}
