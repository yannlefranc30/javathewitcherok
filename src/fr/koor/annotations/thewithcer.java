
import java.util.Scanner; // import scanner

public class thewithcer {

    public static void main( String [] args ) {

        try ( Scanner scanner = new Scanner( System.in ) ) {

            String login, password;
              // boucle do while

            do {
                System.out.print( "saisi ton nom  : " );
                login = scanner.nextLine();

                System.out.print( "saisie le mot de passe  " );
                password = scanner.nextLine();
            } while( login.equals( "yann" ) == false || password.equals( "12345678" ) == false );

            System.out.println( "Bonjour yann, vous êtes connecté !" );

        }
    }
}




























