import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        AudioPlayer audio = new AudioPlayer("MP3", "Bruno Mars - 'Lazy Song'");
        VideoPlayer video = new VideoPlayer("MP4", "Oct 12, 1999 - 'Picnic Date' ");
        StreamingPlayer stream = new StreamingPlayer("Streaming", "NBC's news");

        System.out.println("\nViolet's Media Player\n");

        ArrayList<MediaPlayer> player = new ArrayList<>();
        player.add(audio);
        player.add(video);
        player.add(stream);

        for (MediaPlayer info : player ){
           info.play();
           info.pause();
           info.stop();
           System.out.println();

        }

    }
}