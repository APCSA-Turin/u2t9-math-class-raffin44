public class RightTriangle {
    
    //instance variables
    private double base; 
    private double height;
    
    public RightTriangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double hypotenuse(){
        double sum = (Math.pow(base, 2)) + (Math.pow(height, 2));
        double hypotenuse = Math.sqrt(sum); 
        return hypotenuse; 
    }
}
