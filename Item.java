public class Item {

    protected String titulo;
    protected int tempoDuracao;
    protected double preco;

    public Item (String oTitulo, int oTempo, double oPreco){

        titulo = oTitulo;
        tempoDuracao = oTempo;
        preco = oPreco;
    }

    public double getReajuste(){
        preco += preco * 0.10;
        return preco;
    }
    
    public void print(){
    
    System.out.printf("Titulo: %s (%d mins) preco: %.2f\n",titulo,tempoDuracao,preco);


    }


}
