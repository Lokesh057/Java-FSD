package EmailTracker;
import java.util.Scanner;
public class EmailSearch {

	public static void main(String[] args) {
		
		        String[] emailArray = {
		                "lokesh.joe@example.com",
		                "jaine.luce@example.com",
		                "alice.sandy@example.com",
		                // Add more email IDs as needed
		        };

		        // Read user input for the email ID to search
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the email ID to search: ");
		        String searchEmail = scanner.nextLine();

		        // Search for the entered email ID in the array
		        boolean found = false;
		        for (String email : emailArray) {
		            if (email.equals(searchEmail)) {
		                found = true;
		                break;
		            }
		        }
		        if (found) {
		            System.out.println("Email ID '" + searchEmail + "' Found in the array.");
		        } else {
		            System.out.println("Email ID '" + searchEmail + "' Not found in the array.");
		        }

		        scanner.close();

	}

}
