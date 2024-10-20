public class AudioPlayer implements MediaPlayer{

    public String type;
    public String title;

    public AudioPlayer(String type, String title){
        this.type = type;
        this.title = title;
    }

    @Override
    public void play(){
        System.out.println( "type: "+ type + " \nIs playing: " + title);
    }

}
