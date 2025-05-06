public class LightBoard{
    private boolean[][] lights; 

    public LightBoard(int numRows, int numCols){
        lights = new boolean[numRows][numCols]; 
        for (int row = 0; row<lights.length; row++){
            for (int col = 0; col<lights[0].length; col++){
                if (Math.random()<.4){
                    lights[row][col] = true; 
                }
            }
        }
    }

    public boolean evaluateLight(int row, int col){
        boolean light = lights[row][col]; 
        int colLights = 0; 
        for (int r = 0; r < lights.length; r++){
            if (lights[r][col]){
                colLights++; 
            }
        }
        if (light && colLights%2==0){
            return false; 
        }
        if (!light && colLights%3==0){
            return true; 
        }
        return light; 
    }

    public double test(){
        double ons = 0; 
        for (boolean[] row : lights){
            for (boolean light : row){
                if (light){
                    ons++; 
                }
            }
        }
        return ons / (lights.length*lights[0].length); 
    }

    public void setLights(boolean[][] in){
        lights = in; 
    }
}