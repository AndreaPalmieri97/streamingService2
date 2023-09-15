package prodotti;

import actors.Attore;
import enums.Genere;

public class SerieTV extends Prodotto {

    private int numeroStagioni;
    private int episodiPerStagione;

    public SerieTV(String titolo, int anno, Attore[] cast, Genere genere, boolean pg, boolean original,
                   int numeroStagioni, int episodiPerStagione) {
        super(titolo, anno, cast, genere, pg, original);
        if(numeroStagioni<1){
            throw new IllegalArgumentException("Numero stagioni inserite non valido");
        }
        this.numeroStagioni = numeroStagioni;
        if(episodiPerStagione<1){
            throw new IllegalArgumentException("Numero episodi inseriti non validi");
        }
        this.episodiPerStagione = episodiPerStagione;
    }

    public int getNumeroStagioni() {
        return numeroStagioni;
    }

    public void setNumeroStagioni(int numeroStagioni) {
        if(numeroStagioni<1){
            throw new IllegalArgumentException("Numero stagioni inserite non valido");
        }
        this.numeroStagioni = numeroStagioni;
    }

    public int getEpisodiPerStagione() {
        return episodiPerStagione;
    }

    public void setEpisodiPerStagione(int episodiPerStagione) {
        if(episodiPerStagione<1){
            throw new IllegalArgumentException("Numero episodi inseriti non validi");
        }
        this.episodiPerStagione = episodiPerStagione;
    }

    @Override
    public String toString() {
        return titolo;
    }
}
