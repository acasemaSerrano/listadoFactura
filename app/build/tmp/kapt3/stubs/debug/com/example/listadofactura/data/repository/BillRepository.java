package com.example.listadofactura.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/listadofactura/data/repository/BillRepository;", "", "()V", "Companion", "app_debug"})
public final class BillRepository {
    private static com.example.listadofactura.data.dao.BillDao billDao;
    private static final androidx.lifecycle.MutableLiveData<java.util.List<com.example.listadofactura.data.model.Bill>> billLiveData = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.listadofactura.data.repository.BillRepository.Companion Companion = null;
    
    public BillRepository() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/listadofactura/data/repository/BillRepository$Companion;", "", "()V", "billDao", "Lcom/example/listadofactura/data/dao/BillDao;", "billLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/listadofactura/data/model/Bill;", "add", "", "bill", "(Lcom/example/listadofactura/data/model/Bill;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addAll", "bills", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object get(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<com.example.listadofactura.data.model.Bill>> p0) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object add(@org.jetbrains.annotations.NotNull()
        com.example.listadofactura.data.model.Bill bill, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object addAll(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.listadofactura.data.model.Bill> bills, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}