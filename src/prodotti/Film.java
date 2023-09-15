package prodotti;

import actors.Attore;
import enums.Genere;

public class Film extends Prodotto {

    private int durata;

    public Film(String titolo, int anno, Attore[] cast, Genere genere, boolean pg, boolean original, int durata) {
        super(titolo, anno, cast, genere, pg, original);
            if(durata < 45 || durata > 200){
                throw new IllegalArgumentException("Durata del film inserita non valida");
            }
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        if(durata < 45 || durata > 200){
            throw new IllegalArgumentException("Durata del film inserita non valida");
        }
            this.durata = durata;
    }

    @Override
    public String toString() {
        return titolo;
    }
}
