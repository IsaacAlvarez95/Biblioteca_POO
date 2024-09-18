import java.util.*;

public final class Mazo {

    ArrayList<Carta> baraja = new ArrayList<>();
    ArrayList<Carta> pila = new ArrayList<>();

    public Mazo(){
        resetMazo();
    }

    public void resetMazo(){
        Carta carta = new Carta(Carta.Figura.PICA, 2);
        for(int i = 2; i <= 14; i++){
            for(int j = 1; j <= 4; j++){
                switch(j){
                    case 1 -> carta = new Carta(Carta.Figura.PICA, i);
                    case 2 -> carta = new Carta(Carta.Figura.TREBOL, i);
                    case 3 -> carta = new Carta(Carta.Figura.DIAMANTE, i);
                    case 4 -> carta = new Carta(Carta.Figura.CORAZON, i);
                }
                baraja.add(carta);
            }
        }
    }

    public void redoMazo(){
        for(Carta carta : pila){
            baraja.add(carta);
            pila.remove(0);
        }
    }

    public void shuffleMazo(){
        Collections.shuffle(baraja);
    }

    public ArrayList<Carta> giveMano(int manoSize){
        Carta carta;
        ArrayList<Carta> mano = new ArrayList<>();
        for(int i = 1; i <= manoSize ;i++){
            carta = baraja.get(0);
            baraja.remove(0);
            mano.add(carta);
        }
        return mano;
    }

    public Carta getFromMazo(){
        Carta carta = baraja.get(0);
        baraja.remove(0);
        return carta;
    }

    public void toPila(Carta carta){
        pila.add(carta);
    }

    public Carta getFromPila(){
        Carta carta = baraja.get(0);
        pila.remove(0);
        return carta;
    }

    public String mazoStatus(){
        String status = "Mazo : ["+baraja.size()+"]\nPila : ["+pila.size()+"]\n";
        return status;
    }

}

