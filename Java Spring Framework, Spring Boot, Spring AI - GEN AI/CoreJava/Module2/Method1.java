package CoreJava.Module2;

class Computer {
    public void playMusic() {
        System.out.println("Play Music");
    }

    public String playVideo(String videoName) {

        if(videoName == null)
        {
            return "Pass Video Name";
        }
        return "Playing Video " + videoName;
    }
}

public class Method1 {
    public static void main(String[] args) {

        Computer comp = new Computer();
        comp.playMusic();
        String result = comp.playVideo(null);
        System.out.println(result);
        String result1 = comp.playVideo("X-MAN");
        System.out.println(result1);
    }
}
