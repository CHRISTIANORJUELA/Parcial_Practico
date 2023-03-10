package com.example.almacen.services;

import com.example.almacen.services.Impl.IndexServiceImpl;

public class Instances {
    IndexServiceImpl indexService;

    public Instances(){
        indexService = new IndexServiceImpl();
    }

    public IndexServiceImpl getIndexService() {
        return indexService;
    }
}
