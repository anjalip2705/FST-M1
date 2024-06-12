package Activities;

public class Activity3 {

    public static void main(String[] args) {
        float Earthseconds = 31557600;
    // double Earthdays = 365.25;
    double Mercury = 0.2408467;
    double Venus = 0.61519726;
    double Mars = 1.8808158;
    double Jupiter = 11.862615;
    double Saturn = 29.447498;
    double Uranus = 84.016846;
    double Neptune = 164.79132;

    int old = 1000000000;
    
    
    System.out.println("Age on Mercury: " + old / Earthseconds / Mercury);
        System.out.println("Age on Venus: " + old / Earthseconds / Venus);
        System.out.println("Age on Earth: " + old / Earthseconds);
        System.out.println("Age on Mars: " + old / Earthseconds / Mars);
        System.out.println("Age on Jupiter: " + old / Earthseconds / Jupiter);
        System.out.println("Age on Saturn: " + old / Earthseconds / Saturn);
        System.out.println("Age on Uranus: " + old / Earthseconds / Uranus);
        System.out.println("Age on Neptune: " + old / Earthseconds / Neptune);
    
}
}