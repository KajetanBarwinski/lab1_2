package pl.com.bottega.ecommerce.sales.domain.payment;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;
import pl.com.bottega.ecommerce.sharedkernel.Money;

public class PaymentFactory {
    private ClientData clientData;
    private Money amount;
    private Id aggregateId;

    public PaymentFactory(){
    }

    public PaymentFactory(Id aggregateId, ClientData clientData, Money amount) {
        this.aggregateId = aggregateId;
        this.clientData = clientData;
        this.amount = amount;
    }

    public Payment CreatePayment(){
        return new Payment(aggregateId,clientData,amount);
    }

    public Payment CreatePayment(Id aggregateId, ClientData clientData, Money amount){
        return new Payment(aggregateId,clientData,amount);
    }

    public void SetAggregateId(Id aggregateId){
        this.aggregateId=aggregateId;
    }

    public void SetAmount(Money amount){
        this.amount=amount;
    }

    public void SetClientData(ClientData clientData){
        this.clientData=clientData;
    }

}
