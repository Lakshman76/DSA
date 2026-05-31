// 2126. Destroying Asteroids

import java.util.Arrays;

public class DestroyingAsteroids {
    static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currentMass = mass;
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] <= currentMass) {
                currentMass += asteroids[i];
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int mass = 10;
        int[] asteroids = { 3, 9, 19, 5, 21 };
        System.out.println(asteroidsDestroyed(mass, asteroids));
    }
}
