package InterfaceDay6;



interface Playable {

 void play();
}


class Football implements Playable {
public void play() {
  System.out.println("Playing football");

}
}


public class PlayMain8 {
 public static void main(String[] args) {

     Playable football = new Football();


     football.play();

 }
}


