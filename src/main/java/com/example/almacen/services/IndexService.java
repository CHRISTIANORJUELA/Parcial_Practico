package com.example.almacen.services;

import com.example.almacen.models.Jewel;
import com.example.almacen.models.ReceiptJewel;

import java.util.List;

public interface IndexService {
    public ReceiptJewel calculatePriceJewel(Jewel jewel);
    public List<ReceiptJewel> getListReceiptJewels();
}
