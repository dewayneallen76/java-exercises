/**
 * Created by dewayneallen on 6/6/17.
 */
public class ServerNameGenerator {

    public static void main(String[] args) {
        String noun[] = {"airplane", "baby", "octopus", "dog", "cow", "robot", "zombie", "spider", "sword", "dragon"};
        String adjective[] = {"fat", "hairy", "angry", "stinky", "dead", "crappy", "happy", "horny", "ugly", "tiny"};

        System.out.println(generateName(noun, adjective));
    }

    public static String generateName(String[] noun, String[] adjective) {
        int random = (int) (Math.random() * (noun.length));
        int random2 = (int) (Math.random() * (adjective.length));

        return noun[random] + " " + adjective[random2];
    }
}
