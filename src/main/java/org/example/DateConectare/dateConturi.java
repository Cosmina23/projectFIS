package org.example.DateConectare;

import java.util.ArrayList;

public class dateConturi {
    private static ArrayList<dateCetatean> cetateni = new ArrayList<>();
    private static ArrayList<datePrimar> primari = new ArrayList<>();

    public void adaugaCetatean(dateCetatean c){
        cetateni.add(c);
    }
    public void adaugaParimar(datePrimar p){
        primari.add(p);
    }
    public boolean verificaCredentialeCedatean(dateCetatean c){
        for(dateCetatean aux : cetateni){
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

    public boolean verificaCredentialePrimar(datePrimar p){
        for(datePrimar aux : primari){
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
