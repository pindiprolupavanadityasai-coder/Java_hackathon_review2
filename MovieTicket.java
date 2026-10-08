import java.util.Scanner;
class MovieTicket {
private String movieName;
private double ticketPrice;
private int numberOfTickets;

// Parameterized constructor
public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
this.movieName = movieName;
this.ticketPrice = ticketPrice;
this.numberOfTickets = numberOfTickets;
}

// Total = ticket price × number of tickets
public double calculateTotal() {
return ticketPrice * numberOfTickets;
}

// 10% discount if 5 or more tickets, otherwise 0
public double calculateDiscount() {
if (numberOfTickets >= 5) {
return calculateTotal() * 0.10;
}
return 0.0;
}

// Final amount = total - discount
public double calculateFinalAmount() {
return calculateTotal() - calculateDiscount();
}

// Display the complete bill
public void displayBill() {
System.out.println("\n===== CINEMA TICKET BILL =====");
System.out.println("Movie Name : " + movieName);
System.out.printf("Ticket Price : %.2f%n", ticketPrice);
System.out.println("Number of Tickets: " + numberOfTickets);
System.out.printf("Total Amount : %.2f%n", calculateTotal());
System.out.printf("Discount : %.2f%n", calculateDiscount());
System.out.printf("Final Amount : %.2f%n", calculateFinalAmount());
System.out.println("==============================");
}
}
public class CinemaBookingSystem {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter movie name: ");
String movieName = sc.nextLine();

System.out.print("Enter ticket price: ");
double ticketPrice = sc.nextDouble();

System.out.print("Enter number of tickets: ");
int numberOfTickets = sc.nextInt();

MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);

ticket.displayBill();

sc.close();
}
}