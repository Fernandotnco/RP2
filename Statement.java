public class Statement {
    private static String NameText(String s);
    private static String MovieText(String title, String charge);
    private static String ChargeText(String s);
    private static String NameFrequentTextText(String s);

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = NameText(aCustomer.getName())
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += MovieText(each.getMovie().getTitle(), String.valueOf(each.getCharge()))
        }
        //add footer lines

        result += ChargeText(String.valueOf(aCustomer.getTotalCharge()))
        result += "On this rental you earned <EM>" + 
        result += FrequentText(String.valueOf(aCustomer.getTotalFrequentRenterPoints()))
        return result;
    }
}