import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;
    private AudioPlayer audio;
    private VideoPlayer video;
    private StreamingPlayer stream;

    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        PrintStream testOut = new PrintStream(outputStream);
        originalOut = System.out;
        System.setOut(testOut);


        audio = new AudioPlayer("RAW", "Test Audio");
        video = new VideoPlayer("RAW", "Test Video");
        stream = new StreamingPlayer("RAW", "Test Streaming");
    }

    // Normal test case AudioPlayer
    @Test
    void testAudioAndParameter(){
        audio.play();
        assertEquals("type: RAW \nIs playing: Test Audio", outputStream.toString().trim());
    }

    @Test
    void testAudioAndPause(){
        audio.pause();
        assertEquals("Player Has Paused", outputStream.toString().trim());
    }


    @Test
    void testAudioAndStop(){
        audio.stop();
        assertEquals("Player Has Stopped", outputStream.toString().trim());
    }

    // Edge test case AudioPlayer

    @Test
    void testAudioAndMissingParameter(){
        audio = new AudioPlayer("MP3", " ");
        audio.play();
        assertEquals("type: MP3 \nIs playing:", outputStream.toString().trim());
    }

    @Test
    void testVideoEmptyType() {
        video = new VideoPlayer("", "Test Video");
        video.play();
        assertEquals("type: \nIs playing: Test Video", outputStream.toString().trim());
    }

    // Test 3: Edge case - Missing media title for StreamingPlayer
    @Test
    void testStreamMissingTitle() {
        stream = new StreamingPlayer("Streaming", " ");
        stream.play();
        assertEquals("type: Streaming\nIs streaming:", outputStream.toString().trim());
    }


    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }
}
