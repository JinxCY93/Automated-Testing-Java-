package learning;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DiscountSystem
 */
public class DiscountSystem {
    public static int solveAbsoluteDiscount(int target){
        int price = 1500;
        int total;
        total = price - target;
        return total;
    }    

    public static int solvePercentageDiscount(int target){
        int price = 1500;
        int totalPrice = 0;
        int percentage = 100;
        int discountValue = percentage - target;
        totalPrice = price * discountValue / percentage;
        return totalPrice;
    }

    public static boolean solveValidityPeriodDiscount(String target) throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        Date insertedDate = dateFormat.parse(target);
        if(date.compareTo(insertedDate) >= 0){
            return false;
        }else{
        return true;
        }
    }

    public static boolean solveSpecificProductDiscounts(String target){
        String discountItem = "laptop";
        if(target == discountItem){
            return true;
        }else{
            return false;
        }
    }
}