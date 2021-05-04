package com.example.listadofactura.data.model;

import java.lang.System;

/**
 * clase filtro podria pasar por clase POJO, sirbe para filtrar los bills
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\'B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003JA\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0006H\u00d6\u0001J\t\u0010&\u001a\u00020\nH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006("}, d2 = {"Lcom/example/listadofactura/data/model/Filter;", "", "dateFrom", "Ljava/time/LocalDate;", "dateTo", "minMoney", "", "maxMoney", "states", "", "", "(Ljava/time/LocalDate;Ljava/time/LocalDate;IILjava/util/List;)V", "getDateFrom", "()Ljava/time/LocalDate;", "setDateFrom", "(Ljava/time/LocalDate;)V", "getDateTo", "setDateTo", "getMaxMoney", "()I", "setMaxMoney", "(I)V", "getMinMoney", "setMinMoney", "getStates", "()Ljava/util/List;", "setStates", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "State", "app_debug"})
public final class Filter {
    @org.jetbrains.annotations.NotNull()
    private java.time.LocalDate dateFrom;
    @org.jetbrains.annotations.NotNull()
    private java.time.LocalDate dateTo;
    private int minMoney;
    private int maxMoney;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> states;
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getDateFrom() {
        return null;
    }
    
    public final void setDateFrom(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getDateTo() {
        return null;
    }
    
    public final void setDateTo(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate p0) {
    }
    
    public final int getMinMoney() {
        return 0;
    }
    
    public final void setMinMoney(int p0) {
    }
    
    public final int getMaxMoney() {
        return 0;
    }
    
    public final void setMaxMoney(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getStates() {
        return null;
    }
    
    public final void setStates(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public Filter(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate dateFrom, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate dateTo, int minMoney, int maxMoney, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> states) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    /**
     * clase filtro podria pasar por clase POJO, sirbe para filtrar los bills
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.listadofactura.data.model.Filter copy(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate dateFrom, @org.jetbrains.annotations.NotNull()
    java.time.LocalDate dateTo, int minMoney, int maxMoney, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> states) {
        return null;
    }
    
    /**
     * clase filtro podria pasar por clase POJO, sirbe para filtrar los bills
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * clase filtro podria pasar por clase POJO, sirbe para filtrar los bills
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * clase filtro podria pasar por clase POJO, sirbe para filtrar los bills
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    /**
     * clase estatica para los elementos posibles de states de la clase padre
     * Se podia canbiar por una enumeracion con posivilidad de varias
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/listadofactura/data/model/Filter$State;", "", "()V", "Companion", "app_debug"})
    public static final class State {
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String Pagada = "Pagada";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String Anulada = "Anulada";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String CuotaFija = "Cuota Fija";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String PendientePago = "Pendiente de pago";
        @org.jetbrains.annotations.NotNull()
        private static java.lang.String PlanPago = "Plan de pago";
        @org.jetbrains.annotations.NotNull()
        public static final com.example.listadofactura.data.model.Filter.State.Companion Companion = null;
        
        public State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/listadofactura/data/model/Filter$State$Companion;", "", "()V", "Anulada", "", "getAnulada", "()Ljava/lang/String;", "setAnulada", "(Ljava/lang/String;)V", "CuotaFija", "getCuotaFija", "setCuotaFija", "Pagada", "getPagada", "setPagada", "PendientePago", "getPendientePago", "setPendientePago", "PlanPago", "getPlanPago", "setPlanPago", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getPagada() {
                return null;
            }
            
            public final void setPagada(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getAnulada() {
                return null;
            }
            
            public final void setAnulada(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCuotaFija() {
                return null;
            }
            
            public final void setCuotaFija(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getPendientePago() {
                return null;
            }
            
            public final void setPendientePago(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getPlanPago() {
                return null;
            }
            
            public final void setPlanPago(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            private Companion() {
                super();
            }
        }
    }
}