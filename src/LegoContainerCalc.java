public class LegoContainerCalc {
    public static void main(String[] args) {

        // 1. Choose an odd number of bricks between 50 and 100
        int amountOfBricks = 75;

        // 2. Choose an even number for container capacity between 5 and 10
        int containerCapacity = 8;

        // 3. Calculate full containers
        // In Java, int / int performs integer division (drops the remainder)
        int fullContainers = amountOfBricks / containerCapacity;

        // 4. Calculate total containers (full + the one partially filled)
        // Since we have an odd number of bricks and even capacity,
        // there will ALWAYS be a remainder.
        int totalContainers = fullContainers + 1;

        // 5. Calculate bricks in the non-full container using modulo (%)
        int remainingBricks = amountOfBricks % containerCapacity;

        // Console Output
        System.out.println("--- Lego Packing Report ---");
        System.out.println("Total bricks to pack: " + amountOfBricks);
        System.out.println("Each container holds: " + containerCapacity + " bricks.");
        System.out.println("Number of completely full containers: " + fullContainers);
        System.out.println("Total number of containers used: " + totalContainers);
        System.out.println("Bricks in the partially filled container: " + remainingBricks);
    }
}