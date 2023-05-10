package newClass11;

public class Main {
    public Client cheapestList(Client[] client){
        Client result = client[0];
        for (int i = 0; i < client.length; i++) {
            if (client[i].howMuchIsCost() < result.howMuchIsCost()){
                result = client[i];
            }
        }
        return result;
    }
}
