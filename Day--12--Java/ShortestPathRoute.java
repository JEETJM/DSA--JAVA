import java.util.Scanner;

public class ShortestPathRoute {

    public static double getShortestPath(String route) {
        int x = 0;
        int y = 0;

        route = route.toUpperCase();

        for (int i = 0; i < route.length(); i++) {
            char direction = route.charAt(i);

            if (direction == 'E') {
                x++;
            } else if (direction == 'W') {
                x--;
            } else if (direction == 'N') {
                y++;
            } else if (direction == 'S') {
                y--;
            } else {
                System.out.println("Invalid direction found: " + direction);
            }
        }

        int xSquare = x * x;
        int ySquare = y * y;

        return Math.sqrt(xSquare + ySquare);
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Shortest Path Finder");
        System.out.println("Use only these directions:");
        System.out.println("E = East");
        System.out.println("W = West");
        System.out.println("N = North");
        System.out.println("S = South");

        System.out.print("\nEnter route: ");
        String route = sc.nextLine();

        double shortestPath = getShortestPath(route);

        System.out.println("\nShortest Path Distance = " + shortestPath);

        System.out.println("\nTime Complexity = O(n)");
        System.out.println("Space Complexity = O(1)");

        sc.close();
    }
}