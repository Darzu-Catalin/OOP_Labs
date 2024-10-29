package Lab1.Task1And3;

public class Display {
    private int width;
    private int height;
    private float ppi;
    private String model;

    public Display(int width, int height, float ppi, String model) {
        this.width = width;
        this.model = model;
        this.ppi = ppi;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPpi() {
        return ppi;
    }

    public void setPpi(float ppi) {
        this.ppi = ppi;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void compareSize(Display m){
        String s = (this.height * this.width) > (m.getHeight() * m.getWidth()) ?
                    this.model + " has a bigger size" :
                    (this.height * this.width) == (m.getHeight() * m.getWidth()) ?
                    this.model + " " + m.getModel() + " have the same size" :
                    m.getModel() + " has a bigger size";
        System.out.println(s);
    }
    public void compareSharpness(Display m){
        String s = this.ppi > m.getPpi() ?
                this.model + " is sharper" :
                (this.ppi) == (m.getPpi()) ?
                this.model + " " + m.getModel() + " are equally sharp" :
                m.getModel() + " is sharper";
        System.out.println(s);
    }
    public void compareWithMonitor(Display m){
        compareSize(m);
        compareSharpness(m);
    }
}
