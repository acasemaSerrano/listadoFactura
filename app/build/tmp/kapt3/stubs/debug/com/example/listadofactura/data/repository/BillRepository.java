package com.example.listadofactura.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/listadofactura/data/repository/BillRepository;", "", "()V", "Companion", "app_debug"})
public final class BillRepository {
    private static com.example.listadofactura.data.dao.BillDao billDao;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.listadofactura.data.repository.BillRepository.Companion Companion = null;
    
    public BillRepository() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/listadofactura/data/repository/BillRepository$Companion;", "", "()V", "billDao", "Lcom/example/listadofactura/data/dao/BillDao;", "add", "", "bill", "Lcom/example/listadofactura/data/model/Bill;", "addAll", "bills", "", "get", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.listadofactura.data.model.Bill> get() {
            return null;
        }
        
        public final void add(@org.jetbrains.annotations.NotNull()
        com.example.listadofactura.data.model.Bill bill) {
        }
        
        public final void addAll(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.listadofactura.data.model.Bill> bills) {
        }
        
        private Companion() {
            super();
        }
    }
}