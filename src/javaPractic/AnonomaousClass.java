package javaPractic;

abstract class audioprocess{

	protected abstract void playaudio();
	
}

public class AnonomaousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		audioprocess audio = new audioprocess() {
			protected void playaudio() {
				System.out.println("audio plays");
			}
			
		};
		audio.playaudio();
	}
	

}






//
//abstract class AudioProcessor {
//    abstract void process();
//}
//
//public class  AnonomaousClass{
//    public static void main(String[] args) {
//        AudioProcessor processor = new AudioProcessor() {
//            void process() {
//                System.out.println("Processing audio...");
//            }
//        };
//        processor.process();
//    }
//}
//
