public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100; //sets int car to 100
        space_in_a_car = 4.0;// sets double to 4.0
        drivers = 30;// sets int to 30
        passengers = 90;// int 90
        cars_not_driven = cars - drivers;// 100-30 = int cars not driven 
        cars_driven = drivers; // 30 drivers = 30 cars driven
        carpool_capacity = cars_driven * space_in_a_car;// cars with drivers * seats
        average_passengers_per_car = passengers / cars_driven;// 90/ number of cars with drivers


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}