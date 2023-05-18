package org.example.DateConectare;

import java.util.ArrayList;

public class dateConturi {
    private ArrayList<Cetatean> cetateni = new ArrayList<>();
    private ArrayList<Primar> primari = new ArrayList<>();

    public void adaugaCetatean(Cetatean c){
        cetateni.add(c);
    }
    public void adaugaParimar(Primar p){
        primari.add(p);
    }
    public boolean verificaCredentialeCedatean(Cetatean c){
        for(Cetatean aux : cetateni){
            if(aux.getNume().equals(c.getNume())){//daca s-a gasit o potrivire se verifica si restul de credentiale
                if((aux.getPrenume().equals(c.getPrenume()) && (aux.getOras().equals(c.getOras()))))
                    if((aux.getEmail().equals(c.getEmail())) && (aux.getUsername().equals(c.getUsername())) && (aux.getTelefon().equals(c.getTelefon()))) {
                        if (aux.getParola().equals(c.getParola()))
                            return true;
                        else{
                            //printare eroare parola gresita
                        }
                    }
            }
        }
        return false;
    }

    public boolean verificaCredentialePrimar(Primar p){
        for(Primar aux : primari){
            if(aux.getNume().equals(p.getNume())){//daca s-a gasit o potrivire se verifica si restul de credentiale
                if((aux.getPrenume().equals(p.getPrenume()) && (aux.getOras().equals(p.getOras()))) && (aux.getCodPrimar().equals(p.getCodPrimar())))
                    if((aux.getEmail().equals(p.getEmail())) && (aux.getUsername().equals(p.getUsername())) && (aux.getTelefon().equals(p.getTelefon()))) {
                        if (aux.getParola().equals(p.getParola()))
                            return true;
                        else{
                            //printare eroare parola gresita
                        }
                    }
            }
        }
        return false;
    }
}
