package com.solid.d.good;

import com.solid.i.Invoice;

public class HtmlInvoicePrinter implements InvoicePrinter_I {

    @Override
    public void print(Invoice invoice) {
        System.out.println("Printing invoice as HTML: " + invoice);
    }
}
