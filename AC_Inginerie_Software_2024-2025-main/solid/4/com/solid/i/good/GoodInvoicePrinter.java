package com.solid.i.good;

import com.solid.d.good.InvoicePrinter_I;
import com.solid.i.Invoice;

public class GoodInvoicePrinter implements InvoicePrinter_I {

    @Override
    public void print(Invoice invoice) {
        System.out.println("Printing invoice " + invoice);
    }
}
