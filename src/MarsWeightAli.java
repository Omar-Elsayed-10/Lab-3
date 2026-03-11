public class MarsWeightAli {

    static float earthWeightAli;
    static float marsGravityRateAli;
    static float marsWeightFloatAli;
    static double marsWeightDoubleAli;
    static int marsWeightIntAli;
    static char marsWeightCharAli;
    static int finalMathResultAli;

    public static void main(String[] args) {

        earthWeightAli = 85.0f;
        marsGravityRateAli = 0.38f;

        marsWeightFloatAli = earthWeightAli * marsGravityRateAli;
        System.out.println("Weight on Earth: " + earthWeightAli + " kg");
        System.out.println("Mars gravity is 38% of Earth's.");

        marsWeightDoubleAli = (double) marsWeightFloatAli;

        System.out.printf("Weight on Mars (double, 4 decimal places): %.4f%n", marsWeightDoubleAli);

        marsWeightIntAli = (int) marsWeightDoubleAli;
        System.out.println("Weight on Mars cast to int: " + marsWeightIntAli);

        marsWeightCharAli = (char) marsWeightIntAli;

        System.out.println("Int cast to char (ASCII value " + marsWeightIntAli + "): " + marsWeightCharAli);

        finalMathResultAli = marsWeightCharAli + 10;
        System.out.println("Added 10 to the char value, resulting in new int: " + finalMathResultAli);
    }
}