import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> konsole = new LinkedList<String>();
        konsole.add("xbox");
        konsole.add("xbox");
        konsole.add("ps5");
        konsole.add("ps2");
        konsole.add("xbox");
        konsole.add("ps4");
        konsole.add("nintendo");
        konsole.add("pegazus");
        konsole.add("ps2");
        konsole.add("ps1");
        int count = 0;
        for (int i = 0; i < konsole.length; i++){
            if (konsole[i] == "xbox") {
                count++;
            }
        }
        System.out.println("Znaleziono "+count+ " xboxów.");
    }
}