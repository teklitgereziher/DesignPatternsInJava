package creationalpatterns.singleton.singlethreaded;

public class ClientSingleThread {
    public static void main(String[] args) {
        System.out.println("This is Singleton Pattern." + "\n");

        Government singleton = Government.getInstance("SOD");
        Government anotherSingleton = Government.getInstance("SD");
        
        System.out.println(singleton.name);
        System.out.println(anotherSingleton.name);
    } 
}
