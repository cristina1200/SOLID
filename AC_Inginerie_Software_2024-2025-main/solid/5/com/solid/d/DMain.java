package com.solid.d;

import com.solid.d.good.GoodPrintingService;
import com.solid.d.good.HtmlInvoicePrinter;
import com.solid.i.Invoice;
import com.solid.i.good.GoodInvoicePrinter;

public class DMain {

    public static void main(String[] args) {
        testGoodD();
    }

    private static void testGoodD() {
        Invoice invoice = new Invoice(665);

        // Use GoodInvoicePrinter
        GoodPrintingService goodPrintingService = new GoodPrintingService(new GoodInvoicePrinter());
        goodPrintingService.print(invoice);

        // Switch to HtmlInvoicePrinter
        goodPrintingService = new GoodPrintingService(new HtmlInvoicePrinter());
        goodPrintingService.print(invoice);
    }
}
