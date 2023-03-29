public class ItemApp {
    public static void main(String[] args) throws Exception {
        Video video = new Video("Video 1", "Robert Viana", 2, 20.00);
        CD cd = new CD("CD1", "Leo Antunes", 6, 10.00);

        cd.print(); //chamar método da classe Item
        System.out.printf("Artista: %s\n\n", cd.getArtista()); //chamar método da classe CD
        
        video.print(); //chamar método da classe Item
        System.out.printf("Diretor do vídeo: %s\n", video.getDiretor()); //chamar método da classe Video
        video.setDiretor("André Felipe");
        
        System.out.println("Diretor do vídeo alterado: " + video.getDiretor());
        System.out.printf("\nPreço reajustado: %.2f \n", cd.getReajuste());
        
        cd.print();
        System.out.printf("\nPreço reajustado: %.2f \n", video.getReajuste());
        video.print();

    }

}