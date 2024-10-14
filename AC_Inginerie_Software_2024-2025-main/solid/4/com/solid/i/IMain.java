package com.solid.i;

import java.util.Date;

import com.solid.i.good.ComplexInvoicePrinter_I;
import com.solid.i.good.GoodInvoicePrinter;
import com.solid.i.good.InvoicePrinter_I;
import com.solid.i.good.SomeOtherGoodInvoicePrinter;
import com.solid.i.good.SomeOtherPrintMethod_I;

public class IMain {

	public static void main(String[] args) {
		testGoodI();
	}

	private static void testGoodI() {
		Invoice invoice = new Invoice(423);
		ComplexInvoice complexInvoice = new ComplexInvoice(242, new Date());

		InvoicePrinter_I goodInvoicePrinter = new GoodInvoicePrinter();
		ComplexInvoicePrinter_I complexInvoicePrinter = (ComplexInvoicePrinter_I) goodInvoicePrinter;

		goodInvoicePrinter.print(invoice);
		complexInvoicePrinter.printComplexInvoice(complexInvoice);

		SomeOtherPrintMethod_I someOtherGoodInvoicePrinter = new SomeOtherGoodInvoicePrinter();
		someOtherGoodInvoicePrinter.someOtherPrintMethod(invoice);
	}
}
