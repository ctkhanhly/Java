//https://stackoverflow.com/questions/276292/capturing-image-from-webcam-in-java

public class SimpleVideoTest extends JFrame implements Runnable{

    private MarvinVideoInterface    videoAdapter;
    private MarvinImage             image;
    private MarvinImagePanel        videoPanel;

    public SimpleVideoTest(){
        super("Simple Video Test");
        videoAdapter = new MarvinJavaCVAdapter();
        videoAdapter.connect(0);
        videoPanel = new MarvinImagePanel();
        add(videoPanel);
        new Thread(this).start();
        setSize(800,600);
        setVisible(true);
    }
    @Override
    public void run() {
        while(true){
            // Request a video frame and set into the VideoPanel
            image = videoAdapter.getFrame();
            videoPanel.setImage(image);
        }
    }
    public static void main(String[] args) {
        SimpleVideoTest t = new SimpleVideoTest();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}