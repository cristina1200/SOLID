package com.solid.d.good;

import com.solid.i.Invoice;

public class GoodPrintingService {

    private final InvoicePrinter_I invoicePrinter;

    public GoodPrintingService(InvoicePrinter_I invoicePrinter) {
        this.invoicePrinter = invoicePrinter;
    }

    public void print(Invoice invoice) {
        invoicePrinter.print(invoice);
    }
}
