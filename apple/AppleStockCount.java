package apple;

public class AppleStockCount {
    public static void main(String[] args) {
  
      if (args.length == 0) {
          System.out.println("Please give me a qty!");
          return;
      }
  
      int qty = Integer.parseInt(args[0]);
      double cost = 4.50;
      double total = 0;
      StringBuilder message = new StringBuilder();

      if (qty < 1) {
          System.out.println("Out of stock.");
      } else if(qty/12 > 0){
        
        message.append("You have bought ");
        message.append(qty/12);
        message.append(" dozen");
        if (qty/12 > 0 && qty%12 != 0) {
            message.append(" and ");
            message.append(qty%12);
          }
          
        message.append(" apple");
        if(qty%12 > 1){
          message.append("s");
        }  
        message.append(" for a total cost of ");
        if(qty/12 == 3){
          total = qty * cost - 24;
        } else if(qty/12 > 3){
          total = qty * cost - 24 - 7;
        } else {
          total = qty * cost;
        }
        message.append(total);
        message.append(".");
  
        System.out.println(message.toString());
      }
      else {
        total = qty * cost;
        message.append("You have bought ");
        message.append(qty);
        message.append(" apple");
        if (qty > 1) {
          message.append("s");
        }
        message.append(" for a total cost of ");
        message.append(total);
        message.append(".");
  
        System.out.println(message.toString());
  
      }

    }
  }