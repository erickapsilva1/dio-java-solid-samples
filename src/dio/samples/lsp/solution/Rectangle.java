package dio.samples.lsp.solution;

public class Rectangle implements Shape {

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
