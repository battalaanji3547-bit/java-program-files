public class Main { 
    public static void main(String[] args) { 
        
        shapeB circleshape = new circle(); 
        circleshape.Draw2(); 
    } 
} 

interface shapeA { 
    public String baseclass = "shape"; 
    public void Draw(); 
} 

interface shapeB extends shapeA { 
    public String baseclass = "shape2"; 
    public void Draw2(); 
} 

interface shapeC { 
    public String baseclass = "shape3";
    public void Draw3(); 
} 


class circle implements shapeA, shapeB, shapeC { 
    public void Draw() { 
        System.out.println("Drawing circle here:" + shapeA.baseclass); 
    } 
    public void Draw2() { 
        System.out.println("Drawing circle here:" + shapeB.baseclass); 
    } 
    public void Draw3() { 
        System.out.println("Drawing circle here:" + shapeC.baseclass); 
    } 
}
