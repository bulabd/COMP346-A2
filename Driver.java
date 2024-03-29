import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Driver {

    public static void main(String[] args) {
    	
        // try{
        //     PrintStream output = new PrintStream("semophore_output.txt");
        //     System.setOut(output);
        // }catch(FileNotFoundException e){
        //     System.out.println("error: file not found");
        // }

        Network objNetwork = new Network();     
        objNetwork.start();

        Server objServer1 = new Server("server1");        
        objServer1.start();

        Server objServer2 = new Server("server2");        
        objServer2.start();

        Client objClientSend = new Client("sending");
        objClientSend.start();

        Client objClientReceive = new Client("receiving");
        objClientReceive.start();
   }
}
