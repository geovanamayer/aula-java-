public class CD extends Item{

    private String artista;

    public CD(String oTitulo, String oArtista, int oTempo, double oPreco){

        super(oTitulo, oTempo, oPreco);
        artista = oArtista;
    }

    public String getArtista(){
        return artista;

    }
    

}
