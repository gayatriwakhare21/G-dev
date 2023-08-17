import java.awt.Frame;

class MyFrame extends Frame {
    public MyFrame() {
        this.setSize(500, 500);
        this.setVisible(true);
        this.setTitle("New Document");
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
