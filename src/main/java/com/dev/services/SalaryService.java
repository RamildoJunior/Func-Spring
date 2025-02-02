package com.dev.services;

import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    private TaxService taxService;

    private PensionService pensionService;

    public SalaryService(TaxService taxService, PensionService pensionService){
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    public PensionService getPensionService() {
        return pensionService;
    }

    public void setPensionService(PensionService pensionService) {
        this.pensionService = pensionService;
    }
}
