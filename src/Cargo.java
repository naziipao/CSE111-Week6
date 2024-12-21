public class Cargo {
    public static double cargoCapacity = 10.0;
    public static int totalID;
    public boolean loadCheck = false;
    public String content;
    public double instanceWeight;
    public int cargoID;
    public Cargo(String s, double d){
        content = s;
        instanceWeight = d;
        totalID++;
        cargoID = totalID;
    }

    public static double capacity(){
        return cargoCapacity;
    }

    public void load(){
        if(instanceWeight>cargoCapacity){
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
        else{
            cargoCapacity -= instanceWeight;
            loadCheck = true;
            System.out.println("Cargo " + cargoID + " loaded for transport.");
            }
        }

    public void unload() {
        cargoCapacity += instanceWeight;
        loadCheck = false;
        System.out.println("Cargo " + cargoID + " unloaded.");
    }

    public void details(){
        System.out.println("Cargo ID: " + cargoID + ", Contents: " + content + ", \nWeight: " + instanceWeight + ", Loaded: " + loadCheck);
    }
}
