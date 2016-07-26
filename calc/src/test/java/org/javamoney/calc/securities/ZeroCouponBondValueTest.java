package org.javamoney.calc.securities;

import org.javamoney.calc.common.Rate;
import org.javamoney.moneta.Money;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author Manuela Grindei
 */
public class ZeroCouponBondValueTest {

    private static final Money FACE = Money.of(121, "GBP");
    private static final Rate RATE = Rate.of(0.1);
    private static final int NUMBER_OF_YEARS_TO_MATURITY = 2;

    @Test
    public void testCalculate() {
        assertEquals(Money.of(100, "GBP"), ZeroCouponBondValue.calculate(FACE, RATE, NUMBER_OF_YEARS_TO_MATURITY));
    }
}