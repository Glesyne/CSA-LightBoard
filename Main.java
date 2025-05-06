public class Main{
    public static void main(String[] args){
        LightBoard a = new LightBoard(3000, 3000); 
        System.out.println(a.test());
        boolean s = true; 
        boolean d = false; 
        boolean[][] testLights = {
            {s, s, d, s, s}, 
            {s, d, d, s, d}, 
            {s, d, d, s, s}, 
            {s, d, d, d, s}, 
            {s, d, d, d, s}, 
            {s, s, d, s, s}, 
            {d, d, d, d, d}
        }; 
        LightBoard b = new LightBoard(7, 5); 
        b.setLights(testLights);
        System.out.println(b.evaluateLight(0, 3));
        System.out.println(b.evaluateLight(6, 0));
        System.out.println(b.evaluateLight(4, 1));
        System.out.println(b.evaluateLight(5, 4));
    }
}
