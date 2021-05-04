package com.example.listadofactura.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001aH\u0002J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J&\u0010#\u001a\u0004\u0018\u00010\u00172\u0006\u0010!\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u001a\u0010-\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u000e\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u000200R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u00061"}, d2 = {"Lcom/example/listadofactura/ui/fragment/FilterBillFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/listadofactura/databinding/FragmentFilterBillBinding;", "getBinding", "()Lcom/example/listadofactura/databinding/FragmentFilterBillBinding;", "setBinding", "(Lcom/example/listadofactura/databinding/FragmentFilterBillBinding;)V", "dateTimeFormatter", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "getDateTimeFormatter", "()Ljava/time/format/DateTimeFormatter;", "viewModel", "Lcom/example/listadofactura/ui/viewmodel/BillViewModel;", "getViewModel", "()Lcom/example/listadofactura/ui/viewmodel/BillViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "buttonListenerWithDate", "", "view", "Landroid/view/View;", "buttonView", "finit", "Lcom/example/listadofactura/data/model/Filter;", "goBack", "filter", "init", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "showDatePickerDialog", "lisener", "Landroid/app/DatePickerDialog$OnDateSetListener;", "app_debug"})
public final class FilterBillFragment extends androidx.fragment.app.Fragment {
    public com.example.listadofactura.databinding.FragmentFilterBillBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private final java.time.format.DateTimeFormatter dateTimeFormatter = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.listadofactura.databinding.FragmentFilterBillBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.listadofactura.databinding.FragmentFilterBillBinding p0) {
    }
    
    private final com.example.listadofactura.ui.viewmodel.BillViewModel getViewModel() {
        return null;
    }
    
    public final java.time.format.DateTimeFormatter getDateTimeFormatter() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * clase qur inicializa en caso que haya filtro
     */
    private final void init(com.example.listadofactura.data.model.Filter filter) {
    }
    
    /**
     * clase que recoje el filtro
     */
    private final com.example.listadofactura.data.model.Filter finit() {
        return null;
    }
    
    /**
     * clase que va a listBill con o sin filtro(en ca so de sin filtro sera null)
     */
    private final void goBack(com.example.listadofactura.data.model.Filter filter) {
    }
    
    /**
     * clase para los botones que abre el datePiker
     */
    public final void buttonListenerWithDate(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.view.View buttonView) {
    }
    
    /**
     * clase que prepara el datePiker
     */
    public final void showDatePickerDialog(@org.jetbrains.annotations.NotNull()
    android.app.DatePickerDialog.OnDateSetListener lisener) {
    }
    
    public FilterBillFragment() {
        super();
    }
}