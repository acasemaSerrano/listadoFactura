package com.example.listadofactura.data.model;

import java.lang.System;

/**
 * clase tipica POJO
 */
@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lcom/example/listadofactura/data/model/Bill;", "", "descEstado", "", "importeOrdenacion", "", "fecha", "", "(Ljava/lang/String;DJ)V", "getDescEstado", "()Ljava/lang/String;", "setDescEstado", "(Ljava/lang/String;)V", "getFecha", "()J", "setFecha", "(J)V", "getImporteOrdenacion", "()D", "setImporteOrdenacion", "(D)V", "component1", "component2", "component3", "copy", "equals", "", "other", "getFechaByLocaldate", "Ljava/time/LocalDate;", "hashCode", "", "toString", "app_debug"})
public final class Bill {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String descEstado;
    private double importeOrdenacion;
    @androidx.room.PrimaryKey()
    private long fecha;
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDate getFechaByLocaldate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescEstado() {
        return null;
    }
    
    public final void setDescEstado(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getImporteOrdenacion() {
        return 0.0;
    }
    
    public final void setImporteOrdenacion(double p0) {
    }
    
    public final long getFecha() {
        return 0L;
    }
    
    public final void setFecha(long p0) {
    }
    
    public Bill(@org.jetbrains.annotations.NotNull()
    java.lang.String descEstado, double importeOrdenacion, long fecha) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final long component3() {
        return 0L;
    }
    
    /**
     * clase tipica POJO
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.listadofactura.data.model.Bill copy(@org.jetbrains.annotations.NotNull()
    java.lang.String descEstado, double importeOrdenacion, long fecha) {
        return null;
    }
    
    /**
     * clase tipica POJO
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * clase tipica POJO
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * clase tipica POJO
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}