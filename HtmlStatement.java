public class HtmlStatement extends Statement {
   private static String NameText(String s){
       return "<H1>Rentals for <EM>" + s + "</EM></H1><P>\n";
   }
   private static String MovieText(String title, String charge){
       return title + ": " + charge + "<BR>\n";
   }
   private static String ChargeText(String s){
       return "<P>You owe <EM>" + s + "</EM><P>\n";
   }
   private static String NameFrequentTextText(String s){
       return "On this rental you earned <EM>" + s + "</EM> frequent renter points<P>";
   }
}