public class Trafficlight {
    public static void main(String[] args) {
         lights = ("Red""Yellow""Green");
        Stringint currentLightIndex = 0;

        while (true) {
            String currentLight = lights[currentLightIndex];
            System.out.println("Traffic Light is " + currentLight);

            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            currentLightIndex = (currentLightIndex + 1) % 3;
        }
    }
}
