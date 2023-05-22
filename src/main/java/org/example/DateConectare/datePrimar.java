package org.example.DateConectare;

public class datePrimar {
        private String nume, prenume, oras, telefon, email, username, parola, codPrimar;

        public void setNume(String nume){
            this.nume = nume;
        }
        public void setPrenume(String prenume){
            this.prenume = prenume;
        }
        public void setOras(String oras){
            this.oras = oras;
        }
        public void setTelefon(String telefon){
            this.telefon = telefon;
        }
        public void setEmail(String email){
            this.email = email;
        }
        public void setUsername(String username){
            this.username = username;
        }
        public void setParola(String parola){
            this.parola = parola;
        }
        public void setCodPrimar(String codPrimar){
            this.codPrimar = codPrimar;
        }
         public String getNume(){
            return nume;
        }
        public String getPrenume(){
            return prenume;
        }
        public String getOras(){
            return oras;
        }
        public String getTelefon(){
            return telefon;
        }
        public String getEmail(){
            return email;
        }
        public String getUsername(){
            return username;
        }
        public String getParola(){
            return parola;
        }
        public String getCodPrimar(){
            return codPrimar;
        }
}
