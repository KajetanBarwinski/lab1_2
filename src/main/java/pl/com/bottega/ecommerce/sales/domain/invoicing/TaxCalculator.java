package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.sales.domain.productscatalog.ProductType;

import java.util.HashMap;

public class TaxCalculator {
    HashMap<ProductType, TaxInformation> taxMap;

    public void AddToTaxMap(ProductType pt, double r, String d) {
        taxMap.put(pt, new TaxInformation(r, d));
    }

    public void AddToTaxMap(ProductType pt, TaxInformation ti) {
        taxMap.put(pt, ti);
    }

    public TaxInformation SearchTaxInformationByType(ProductType pt) {
        return taxMap.get(pt);
    }

    public TaxCalculator() {
        this.taxMap = new HashMap<>();

        this.AddToTaxMap(ProductType.DRUG, 0.05, "5% (D)");
        this.AddToTaxMap(ProductType.FOOD, 0.07, "7% (F)");
        this.AddToTaxMap(ProductType.STANDARD, 0.23, "23% (STANDARD)");
    }


}
