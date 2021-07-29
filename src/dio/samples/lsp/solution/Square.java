package dio.samples.lsp.solution;

public class Square implements Shape{

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

    @Override
    public double getArea() {
        return getWidth() * getHeight();
    }
}
