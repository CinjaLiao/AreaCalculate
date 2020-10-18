public class AreaCalculate {
    public static void main(String[] args){
        TiXing tx = new TiXing(10, 20, 30);
        Circle cc = new Circle(10);
        System.out.println("Tixing's area is " + tx.calcArea());
        System.out.println("Circle's area is " + cc.calcArea());

    }
}

class TiXing{
    private double shangDi;
    private double xiaDi;
    private double height;

    TiXing(int shangDi, int xiaDi, int height){
        this.shangDi = shangDi;
        this.xiaDi = xiaDi;
        this.height = height;
    }

    public double calcArea(){
        return (shangDi + xiaDi) * height / 2;
    }
}

class Circle{
    private double radium;

    Circle(double radium){
        this.radium = radium;
    }

    public double calcArea(){
        return Math.PI * Math.pow(radium, 2);
    }
}
