public class LegoContainerCalc {
    public static void main(String[] args) {

        int amountOfBricks = 75;
        
        int containerCapacity = 8;

        int fullContainers = amountOfBricks / containerCapacity;

        int totalContainers = fullContainers + 1;

        int remainingBricks = amountOfBricks % containerCapacity;

        System.out.println("--- Lego Packing Report ---");
        System.out.println("Total bricks to pack: " + amountOfBricks);
        System.out.println("Each container holds: " + containerCapacity + " bricks.");
        System.out.println("Number of completely full containers: " + fullContainers);
        System.out.println("Total number of containers used: " + totalContainers);
        System.out.println("Bricks in the partially filled container: " + remainingBricks);
    }
}
