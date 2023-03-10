package com.example.almacen.services.Impl;

import com.example.almacen.models.Jewel;
import com.example.almacen.models.ReceiptJewel;
import com.example.almacen.services.IndexService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IndexServiceImpl implements IndexService {
    List<ReceiptJewel> receiptJewels = new ArrayList<>();

    double[] listQuilates = {2000,4000,8000};

    double[] typeJewel = {7000,20000,10000,6000};

    private final double pricePerOunces = 100;

    private float priceSell;
    public ReceiptJewel calculatePriceJewel(Jewel jewel){
      priceSell = 0;
      String nameUser = jewel.getNameUser();
      switch (jewel.getTypeJewel()){
          case "Oro":
              priceSell += typeJewel[0];
              break;
          case "Diamante":
              priceSell += typeJewel[1];
              break;
          case "Esmeralda":
              priceSell += typeJewel[2];
          case "Ruby":
              priceSell += typeJewel[3];
              break;
      }
      switch (jewel.getQuilates()){
          case "14":
              priceSell += listQuilates[0];
              break;
          case "18":
              priceSell += listQuilates[1];
              break;
          case "24":
              priceSell += listQuilates[2];
              break;
      }

      priceSell += pricePerOunces*jewel.getOunces();

      ReceiptJewel receiptJewel = new ReceiptJewel(nameUser,priceSell, LocalDate.now());
      receiptJewels.add(receiptJewel);
      return receiptJewel;
    }

    public List<ReceiptJewel> getListReceiptJewels(){
        return receiptJewels;
    }

}
