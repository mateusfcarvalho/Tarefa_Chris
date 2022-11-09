package main;

public abstract class Menu {

    //Composicao com instancia de Ordenacao
    protected Menu menu;

    //Comportamento delegado
    public int[] Ordena(int[] vetor) {
        return menu.Ordena(vetor);
    }

    //Getter e Setter
    public void setOrdena(Menu menu) {
        this.menu = menu;
    }

    public Menu getOrdena() {
        return menu;
    }
}
