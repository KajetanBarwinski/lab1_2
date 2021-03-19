package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.math.BigDecimal;

public class TaxInformation {
    BigDecimal ratio = null;
    String desc = null;

    public TaxInformation() {

    }

    public TaxInformation(double ratio, String desc) {
        this.ratio = BigDecimal.valueOf(ratio);
        this.desc = desc;
    }

    public BigDecimal getRatio() {
        return ratio;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
