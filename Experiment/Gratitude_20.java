package Experiment;

public class Gratitude_20 {
    public static void sayThankyou(){
        System.out.println("Thank you for being the best teacher in the world.\n"+"You inspired in me a love for learning and made me feel like i could ask you anything.");
    }
    public static void sayAdditionalGreetings(String greeting) {
        System.out.println(greeting);
    }
    public static void main(String[] args) {
        sayThankyou();
        String expression = "Thankyou... Wish you all the best!!";
        sayAdditionalGreetings(expression);
    }
}