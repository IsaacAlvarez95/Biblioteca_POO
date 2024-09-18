public class Main{
    public static void main(String Args[]){
        Carta carta = new Carta(Carta.Figura.PICA,9);
        System.out.println(carta.getCarta());
        Mazo mazo = new Mazo();
        System.out.println(mazo.mazoStatus());
        Jugador jugador = new Jugador("Jose");
        System.out.println(jugador.infoJugador());
        jugador.getMano(mazo.giveMano(5));
        System.out.println(mazo.mazoStatus());
        System.out.println(jugador.infoJugador());
    }
}