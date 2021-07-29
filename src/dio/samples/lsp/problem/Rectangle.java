package dio.samples.lsp.problem;

public class Rectangle {

    private Double height;
    private Double width;

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getArea(){ return height * width; }

}
