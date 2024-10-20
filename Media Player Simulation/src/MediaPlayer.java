public interface MediaPlayer {
   void play();

   default void pause(){
       System.out.println("Player Has Paused");
   }

    default void stop(){
        System.out.println("Player Has Stopped");
    }

}
