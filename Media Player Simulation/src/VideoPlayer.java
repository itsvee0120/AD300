public class VideoPlayer implements MediaPlayer {

    public String type;
    public String title;

    public VideoPlayer(String type, String title){
        this.type = type;
        this.title = title;
    }
    @Override
    public void play(){
        System.out.println("type: "+ type + "\nIs playing: " + title);
    }
}
