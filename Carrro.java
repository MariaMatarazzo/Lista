public class Carrro extends Brinquedo {

    public Carrro(String cor, String tipo, int velocidade, String nome) {
        super(cor, tipo, velocidade, nome);
    }
        
        @Override
        public void  mover () {
            System.out.println ("O carro está movendo");
    }

}
