package proxyremoteserver;

import domein.GumballMachine;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.concurrent.ThreadLocalRandom;

public class ProxyRemoteServer {

    private final String location;
    private final int count;
    private GumballMachine machine;

    public static void main(String[] args) {
        new ProxyRemoteServer("Hogent", 20).run();
    }

    public ProxyRemoteServer(String location, int count) {
        this.location = location;
        this.count = count;
        registerRemoteGumballMachine();
    }

    private void registerRemoteGumballMachine() {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            machine = new GumballMachine(location, count);
            registry.rebind("gumballmachine", machine);
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }

    private void run() {
        System.out.println("GumballMachine Operational.");
        System.out.println(machine);
        while (machine.getCount() > 0) {
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(9000) + 1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            getAGumball();
            System.out.println(machine);
        }
    }

    private void getAGumball() {
        System.out.println(machine.insertQuarter());
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(2000) + 500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(machine.turnCrank());
    }
}
