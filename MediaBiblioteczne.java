public class MediaBiblioteczne {
    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny;

    public MediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.dostepny = true;
    }

    public void wypozycz(){
        if(dostepny){
            dostepny = false;
            System.out.println("Wypozyczono: " + tytul);
        }
        else{
            System.out.println(tytul + " jest juz wypozyczone.");
        }
    }

    public void zwroc(){
        if(dostepny == false){
            dostepny = true;
            System.out.println("Zwrocono: " + tytul);
        }
        else{
            System.out.println(tytul + " nie bylo wypozyczone.");
        }
    }

    public void wyswietlInfo(){
        String status = dostepny ? "Dostepne" : "Wypozyczone";
        System.out.println("Tytul: " + tytul);
        System.out.println("Rok Wydania: " + rokWydania);
        System.out.println("Status: " + status);
    }
}

