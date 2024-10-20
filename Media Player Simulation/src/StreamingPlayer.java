public class StreamingPlayer implements MediaPlayer {
    public String type;
    public String title;


    public StreamingPlayer(String type, String title){
        this.type = type;
        this.title = title;
    }

    @Override
    public void play(){
        System.out.println("type: "+ type +  "\nIs streaming: " + title);
    }

}
