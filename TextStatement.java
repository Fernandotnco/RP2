public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = "Rental Record for " + aCustomer.getName() +
        "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" +
            String.valueOf(each.getCharge()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
        return result;
    }

   private static String NameText(String s){
       return "Rental Record for " + s + "\n";
   }
   private static String MovieText(String title, String charge){
       return "\t" + title + "\t" + charge + "\n";
   }
   private static String ChargeText(String s){
       return "Amount owed is " + s + "\n";
   }
   private static String NameFrequentTextText(String s){
       return "You earned " + s + " frequent renter points";
   }
}