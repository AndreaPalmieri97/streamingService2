package users;

import prodotti.Prodotto;

import java.util.Scanner;

public class Utente {

    private String nome;
    private String avatar;
    private boolean isKid;
    private String pin;
    private Account account;
    private Prodotto[] laMiaLista = new Prodotto[10];

    public Utente(String nome, String avatar, boolean isKid, String pin, Account account) {
        this.nome = nome;
        this.avatar = avatar;
        this.isKid = isKid;
        this.pin = pin;
        this.account = account;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isKid() {
        return isKid;
    }

    public void setKid(boolean kid) {
        isKid = kid;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void listaProdotti(Prodotto p){
        boolean flag = false;
        for (int i = 0; i < laMiaLista.length; i++) {
            if (laMiaLista[i] == null) {
                laMiaLista[i] = p;
                flag = true;
            }
        }
        if (!flag) System.out.println("ERRORE! Numero massimo di prodotti aggiunti alla lista");
    }

    public void valutazione(Prodotto p){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una valore da 1 a 5");
        int stelle = scanner.nextInt();
        p.mediaValutazione(stelle);
    }
}

