package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

import java.util.ArrayList;
import java.util.List;

public class InvoiceFactory {
    private ClientData client;
    private Money net;
    private Money gros;
    private List<InvoiceLine> items;
    private Id id;

    public InvoiceFactory() {
    }

    public InvoiceFactory(Id invoiceId, ClientData client) {
        this.id = invoiceId;
        this.client = client;
        this.items = new ArrayList<InvoiceLine>();

        this.net = Money.ZERO;
        this.gros = Money.ZERO;
    }

    public InvoiceFactory(ClientData client, Money net, Money gros, List<InvoiceLine> items, Id id) {
        this.client = client;
        this.net = net;
        this.gros = gros;
        this.items = items;
        this.id = id;
    }

    public Invoice CreateInvoice(){
        return new Invoice(client,net,gros,items,id);
    }

    public Invoice CreateInvoice(ClientData client, Money net, Money gros, List<InvoiceLine> items, Id id){
        return new Invoice(client,net,gros,items,id);
    }

    public void setClient(ClientData client) {
        this.client = client;
    }

    public void setNet(Money net) {
        this.net = net;
    }

    public void setGros(Money gros) {
        this.gros = gros;
    }

    public void setItems(List<InvoiceLine> items) {
        this.items = items;
    }

    public void setId(Id id) {
        this.id = id;
    }
}
