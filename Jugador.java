import java.util.*;

public class Jugador {

    private final ArrayList<Carta> mano = new ArrayList<>();
    public String jugador;

    public Jugador(String jugador){
        this.jugador = jugador;
    }

    public void getMano(ArrayList<Carta> mano){
        for(Carta carta: mano){
            this.mano.add(carta);
        }
    }

    public void getCarta(Carta carta){
        mano.add(carta);
    }

    public Carta discardCarta(int posCarta){
        if(posCarta <= 0){
            posCarta = 1;
        }else if(posCarta >= mano.size() + 1){
            posCarta = mano.size() + 1;
        }
        Carta carta = mano.get(posCarta - 1);
        mano.remove(posCarta - 1);
        return carta;
    }

    public int getManoSize(){
        return mano.size();
    }

    public String infoJugador(){
        String cartas = "";
        for(Carta carta : mano){
            cartas = cartas + carta.getCarta() + " ";
        }
        return jugador + " cartas : " + getManoSize() + "\n" + cartas;
    }

}
