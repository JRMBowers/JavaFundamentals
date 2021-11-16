package getPricesLabel;

public class GetPricesLabel {
    public double price(String item){
        if(item == "coffee"){
            return 2.50;
        }
        return 0.00 ;
    }

    public String get_item(String item){
        return "The price for item " + item.toString() + " is " + new GetPricesLabel().price(item);
    }
}
