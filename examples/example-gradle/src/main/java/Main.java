import com.heroiclabs.nakama.*;

public class Main {

    public static void main(String[] args) {
        DefaultClient client = new DefaultClient("defaultkey", "127.0.0.1", 7349, false);

        try {
            String email = "super@heroes.com";
            String password = "batsignal";
            Session session = client.authenticateEmail(email, password).get();
            System.out.println(session);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}