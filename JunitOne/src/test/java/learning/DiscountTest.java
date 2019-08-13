package learning;

import java.text.ParseException;

import org.junit.Test;
import junit.framework.TestCase;
import learning.DiscountSystem;

/**
 * DiscountSystem
 */
public class DiscountTest extends TestCase {
    public void testabsoluteDiscounts() {
        // Given absolute discount
        int target = 200;
        // When
        int result = DiscountSystem.solveAbsoluteDiscount(target);
        // Then
        assertEquals(1300, result);
    }
    
    public void testpercentageDiscounts(){
        // Given percentage discount
        int target = 20;
        // when
        int result = DiscountSystem.solvePercentageDiscount(target);
        // then
        assertEquals(1200, result);
    }

    public void testValidityPeriodDiscounts() throws ParseException{
        String target = "08/20/2019";
        boolean valid = DiscountSystem.solveValidityPeriodDiscount(target);
        assertEquals(true, valid);
    }

    public void testSpecificProductDiscounts(){
        String target = "laptop";
        boolean valid = DiscountSystem.solveSpecificProductDiscounts(target);
        assertEquals(true, valid);
    }

    public void testApplyDiscountInShoppingCart(){
        String target = "Birthday100";
        int result = DiscountSystem.solveApplyDiscountInShoppingCart(target);
        assertEquals(1200, result);
    }
}