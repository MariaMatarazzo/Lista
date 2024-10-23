public class PrincipalBrinquedo {
    public static void main(String[] args) {

        Carrro carrro = new Carrro ("Azul","Chevrolet",20,"Onix");
        System.out.println("cor: "+ carrro.getCor());
        System.out.println("tipo: "+carrro.getTipo());
        System.out.println("tipo: "+carrro.getVelocidade());
        System.out.println("tipo: "+carrro.getNome());
        System.out.println("\n ");
        carrro.mover();
    
    Moto moto = new Moto("Vermelha", "BMW", 80, "GS 1250");
        System.out.println("cor: "+ moto.getCor());
        System.out.println("tipo: "+moto.getTipo());
        System.out.println("tipo: "+moto.getVelocidade());
        System.out.println("tipo: "+moto.getNome());
        System.out.println("\n ");
        moto.mover();

    Navio navio = new Navio("Amarelo", "cruzeiro", 30, "MSC Seashore");
    System.out.println("cor: "+ navio.getCor());
        System.out.println("tipo: "+navio.getTipo());
        System.out.println("tipo: "+navio.getVelocidade());
        System.out.println("tipo: "+navio.getNome());
        System.out.println("\n ");
        navio.mover();
}
}
