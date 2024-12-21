public class Passenger {
    public static int no_of_passenger;
    public static double total_fare;
    public String name;
    public double distance;
    public double passengerFare;
    public Passenger(String s, double d){
        name = s;
        distance = d;
        total_fare += distance*20;
        no_of_passenger++;
        passengerFare = distance*20;
    }

    public void storeBaggageWeight(double d){
        total_fare += d*10;
        passengerFare += d*10;
    }

    public void passengerDetails(){
        System.out.println("Name: " + name + "\nFare: " + passengerFare);
    }
}
