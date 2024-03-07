public class ArrayTriangle {

    public static void main(String[] args) {
        Triangle[] triangle = new Triangle[4];

        triangle[0] = new Triangle(10, 4);
        triangle[1] = new Triangle(20, 10);
        triangle[2] = new Triangle(15, 6);
        triangle[3] = new Triangle(25, 10);

        for (int i = 0; i < triangle.length; i++){
            System.out.println("===================");
            System.out.println("Area of Triangle-" + i + " : " + triangle[i].countArea());
            System.out.println("Perimeter of Triangle-" + i + " : " + triangle[i].countPerimeter());
        }
    }
}