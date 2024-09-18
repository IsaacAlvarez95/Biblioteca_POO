public class Carta
{
    public enum Figura{
        PICA,
        TREBOL,
        DIAMANTE,
        CORAZON
    }

    private final int valor;
    private final Figura figura;

    public Carta(Figura figura, int valor){
        this.figura = figura;
        if(valor < 2){
            this.valor = 2;
        }else if(valor > 14){
            this.valor = 14;
        }else{
            this.valor = valor;
        }
    }

    public String getValor(){
        return switch (valor) {
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            case 14 -> "A";
            default -> Integer.toString(valor);
        };
    
    }

    public String getCarta(){
        return "["+figura+" "+getValor()+"]";
    }
}
