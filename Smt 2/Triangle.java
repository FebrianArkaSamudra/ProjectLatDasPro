public class Triangle {

     public int base;
     public int height;
     public double hypotenuse;

     public Triangle (int a, int t){
        base = a;
        height = t;
     }

     public double countArea(){
        return ( 0.5 *(base *height));
     }

     public double countPerimeter(){
        return ( base +(1/2 * base + ( hypotenuse = 2*(Math.sqrt(Math.pow(base,2 ) + Math.pow(height, 2))))));
     }
}