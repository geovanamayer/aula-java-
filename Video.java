public class Video extends Item {

    private String diretor;

    public Video(String oTitulo, String oDiretor, int oTempo, double oPreco){

        super(oTitulo,oTempo,oPreco);
        diretor = oDiretor;

    }

    public void setDiretor(String oDiretor){
        diretor = oDiretor;
    }

    public String getDiretor(){
        return diretor;
    }
    
    public double getRajuste(){
        preco += preco*0.15 ;
        return preco;
    } 
}
