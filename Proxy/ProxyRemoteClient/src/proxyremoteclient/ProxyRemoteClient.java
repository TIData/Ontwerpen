package proxyremoteclient;

import domein.GumballMachineRemote;
import domein.GumballMonitor;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ProxyRemoteClient {

    private void doTest() {
        try {
            Registry myRegistry = LocateRegistry.getRegistry("localhost", 1099);
            GumballMachineRemote machine = (GumballMachineRemote) myRegistry.lookup("gumballmachine");
            GumballMonitor monitor = new GumballMonitor(machine);
            monitor.report();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ProxyRemoteClient main = new ProxyRemoteClient();
        main.doTest();
    }
}
