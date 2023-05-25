package org.example.dateAnunturi;

public class Anunt {
    private String continut;
    private String dataPublicare, dataIncheiere;

    public Anunt(String c, String datep, String di){
        continut = c;
        dataPublicare = datep;
        dataIncheiere = di;
    }

    public String toString(){
        String r = "";
        r += dataPublicare + " -> "+ dataIncheiere + "\n"+continut;
        return r;
    }
}
