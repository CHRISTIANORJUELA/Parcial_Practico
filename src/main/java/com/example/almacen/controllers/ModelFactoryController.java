package com.example.almacen.controllers;

import com.example.almacen.models.Jewel;
import com.example.almacen.models.ReceiptJewel;
import com.example.almacen.services.Instances;
import com.example.almacen.services.ModelFactoryService;

import java.util.List;

public class ModelFactoryController implements ModelFactoryService {
    Instances instances;
    private static class SingletonHolder {
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        instances = new Instances();
    }

    ///******************************* Program *************************************************

    public ReceiptJewel calculatePriceJewel(Jewel jewel){
        return instances.getIndexService().calculatePriceJewel(jewel);
    }

    public List<ReceiptJewel> getListReceiptJewels(){
        return instances.getIndexService().getListReceiptJewels();
    }
}
