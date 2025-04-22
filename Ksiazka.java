public class Ksiazka extends MediaBiblioteczne{
    private String autor;
    private int liczbaStron;

    public Ksiazka(String tytul, int rokWydania, String autor, int liczbaStron) {
        super(tytul, rokWydania);
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }

    @Override
    public void wyswietlInfo(){
        super.wyswietlInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Liczba Stron: " + liczbaStron);
    }
    public void sprawdzLiczbeStron(){
        if (liczbaStron > 500){
            System.out.println("To dluga ksiazka - " + liczbaStron + " stron.");
        }
        else{
            System.out.println("To standardowa ksiazka - " + liczbaStron + " stron.");
        }
    }

}
