
# Media Player Simulation

## Project Overview

This project demonstrates a simple media player system with support for different types of players, including `AudioPlayer`, `VideoPlayer`, and `StreamingPlayer`. The design uses an interface (`MediaPlayer`) to ensure flexibility and easy expansion of player types without modifying the core system.

Each player type implements common media player functionality: playing, pausing, and stopping media. The media type and title are passed as parameters, and specific behavior is demonstrated through method implementations.

## Features

- **MediaPlayer Interface**: Defines core media player functionality (`play()`, `pause()`, `stop()`).
- **AudioPlayer, VideoPlayer, and StreamingPlayer**: Three implementations of the `MediaPlayer` interface, each simulating different types of media.
- **Interface Methods**:
    - `play()`: Starts the media and prints a message indicating the type of media and its title.
    - `pause()`: Pauses the media and prints a pause message.
    - `stop()`: Stops the media and prints a stop message.

## Classes and Structure

- **`MediaPlayer` Interface**: Defines the contract for media player operations with `play()`, `pause()`, and `stop()`.
- **`AudioPlayer`**: Implements `MediaPlayer` to simulate audio media playing.
- **`VideoPlayer`**: Implements `MediaPlayer` to simulate video media playing.
- **`StreamingPlayer`**: Implements `MediaPlayer` to simulate streaming media playing.

### Class Diagram

```text
    MediaPlayer (Interface)
        |       |       |
AudioPlayer  VideoPlayer  StreamingPlayer
```

### Code Sample

```java
// Example of playing an audio file
AudioPlayer audio = new AudioPlayer("MP3", "Test Audio");
audio.play();   // Output: type: MP3 \nIs playing: Test Audio
audio.pause();  // Output: Player Has Paused
audio.stop();   // Output: Player Has Stopped
```

## How to Run the Program

### Requirements
- **Java 8 or higher**
- **JUnit 5** for testing

### Running the Program

1. Clone or download the project repository.
2. Open the project in your preferred IDE (e.g., IntelliJ, Eclipse).
3. Run the `Main` class to see the media player in action.

```bash
javac Main.java
java Main
```

### Example Output

```text
Violet's Media Player

type: MP3 
Is playing: Bruno Mars - 'Lazy Song'
Player Has Paused
Player Has Stopped

type: MP4
Is playing: Oct 12, 1999 - 'Picnic Date' 
Player Has Paused
Player Has Stopped

type: Streaming
Is streaming: NBC's news
Player Has Paused
Player Has Stopped
```

## Testing

This project includes JUnit 5 test cases to ensure the correct functionality of the `AudioPlayer`, `VideoPlayer`, and `StreamingPlayer` classes. The tests cover:

- **Normal scenarios**: Testing regular play, pause, and stop functionality.
- **Edge cases**: Handling scenarios with missing or empty parameters for media type or title.

### Running Tests

1. Open the project in your preferred IDE.
2. Navigate to the `MediaPlayerTest` class.
3. Run the test suite using JUnit.

### Test Output

Sample test case results:

```text
[PASS] testAudioPlay() - AudioPlayer plays as expected.
[PASS] testVideoPause() - VideoPlayer pauses as expected.
[PASS] testStreamStop() - StreamingPlayer stops as expected.
[PASS] testAudioMissingTitle() - Handles missing media title in AudioPlayer.
[PASS] testVideoEmptyType() - Handles empty media type in VideoPlayer.
[PASS] testStreamMissingTitle() - Handles missing media title in StreamingPlayer.
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any questions or feedback, feel free to reach out to [Violet Nguyen](https://github.com/itsvee0120).

## Acknowledgments
README.md for the "Media Player Simulation" assignment is generated using AI prompts (mainly example cases) then checked by Violet to ensure readability and comprehension.
