package com.example.listadofactura.ui.viewmodel;

import java.lang.System;

/**
 * comparte
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004J\b\u0010\u0011\u001a\u0004\u0018\u00010\bJ\u0011\u0010\u0012\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/listadofactura/ui/viewmodel/BillViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "billLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/listadofactura/data/model/Bill;", "filter", "Lcom/example/listadofactura/data/model/Filter;", "service", "Lcom/example/listadofactura/ui/DowloadService;", "downloadJson", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filtered", "bills", "getBillLiveData", "getFilter", "reloadRoom", "setFilter", "app_debug"})
public final class BillViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.listadofactura.data.model.Bill>> billLiveData = null;
    private com.example.listadofactura.data.model.Filter filter;
    private final com.example.listadofactura.ui.DowloadService service = null;
    
    /**
     * Descarga el json y lo guarda
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object downloadJson(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object reloadRoom(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    private final void filtered(java.util.List<com.example.listadofactura.data.model.Bill> bills) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.listadofactura.data.model.Bill>> getBillLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.listadofactura.data.model.Filter getFilter() {
        return null;
    }
    
    public final void setFilter(@org.jetbrains.annotations.Nullable()
    com.example.listadofactura.data.model.Filter filter) {
    }
    
    public BillViewModel() {
        super();
    }
}