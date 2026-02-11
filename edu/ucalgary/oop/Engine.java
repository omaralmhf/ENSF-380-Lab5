public class Engine {
    private String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public Engine(Engine other) {
        this.engineType = other.engineType; 
    }

    public String getEngineType() {
        return engineType;  
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    
}
