import actors.Attore;
import enums.Genere;
import enums.GenereDocumentario;
import enums.TipoOfferta;
import prodotti.Documentario;
import prodotti.Film;
import prodotti.Prodotto;
import prodotti.SerieTV;
import users.Account;
import users.Utente;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Attore attori1 = new Attore("Jhon", "Travolta", LocalDate.parse("1965-03-21"),
                "Statunitense");
        Attore attori2 = new Attore("fdmpdsmf", "fadfdsds", LocalDate.parse("1964-03-21"),
                "fdsfsdsd");
        Attore attori3 = new Attore("weqwfv", "efdsfds", LocalDate.parse("1969-03-21"),
                "trhgfhs");
        Attore[] attori = {attori1, attori2, attori3};



        Film film1 = new Film("Pulp Fiction", 1999, attori, Genere.THRILLER, true, true, 150);
        Film film2 = new Film("erwerf", 1998, attori, Genere.THRILLER, true, true, 150);
        SerieTV serie1 = new SerieTV("jssmk", 2005, attori, Genere.HORROR, true, false, 3, 7);
        Documentario documentario1 = new Documentario("cnafnl", 1998, attori, Genere.FANTASY,
                false, true, GenereDocumentario.SOCIETA);

        Prodotto[] prodotti = {film1, film2, serie1, documentario1};

        Utente.listaProdotti(prodotti);

        Account account1 = new Account("dpsds@dsods", "dspkdsds", TipoOfferta.BASIC);
        Utente utente1 = new Utente("fsasd", "dsaoda", true, "12345", account1);
        utente1.valutazione(film1);
        utente1.valutazione(film1);
        utente1.valutazione(film1);

    }
}
