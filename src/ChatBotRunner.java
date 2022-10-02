public class ChatBotRunner {
    public static void main(String[] args){
        ChatBot bob = new ChatBot("Bob", 24);
        bob.greeting("Lin Han");
        bob.weather();
        double feet_meters = bob.convertFeetToMeters(1);
        System.out.println("There are " + feet_meters + "in 1 foot!");
        bob.favoriteNumber(7);
        int addition = bob.addNumbers(1,2,3);
        System.out.println("The sum of 1, 2, and 3 is " + addition + " !");
        System.out.println(bob.goodbye());
        bob.digitsPi();
        int age = bob.age();
        System.out.println("You are " + age + " years old!");
    }
}
