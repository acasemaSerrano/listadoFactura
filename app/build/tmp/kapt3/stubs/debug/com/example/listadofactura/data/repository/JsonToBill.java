package com.example.listadofactura.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/listadofactura/data/repository/JsonToBill;", "", "()V", "Companion", "app_debug"})
public final class JsonToBill {
    private static java.util.List<com.example.listadofactura.data.model.Bill> mutableList;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.listadofactura.data.repository.JsonToBill.Companion Companion = null;
    
    public JsonToBill() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/listadofactura/data/repository/JsonToBill$Companion;", "", "()V", "mutableList", "", "Lcom/example/listadofactura/data/model/Bill;", "dateParser", "Ljava/time/LocalDate;", "dateJson", "", "dateParserPrint", "parseToList", "", "json", "Lcom/google/gson/JsonArray;", "app_debug"})
    public static final class Companion {
        
        /**
         * aqui se recoge el json y lo vuelve una lista de Bill(facturas)
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.example.listadofactura.data.model.Bill> parseToList(@org.jetbrains.annotations.Nullable()
        com.google.gson.JsonArray json) {
            return null;
        }
        
        /**
         * Recoge las fechas del json (07/02/2021) y lo convierte a localDate
         */
        @org.jetbrains.annotations.NotNull()
        public final java.time.LocalDate dateParser(@org.jetbrains.annotations.NotNull()
        java.lang.String dateJson) {
            return null;
        }
        
        /**
         * Recoge las fechas del json (07/02/2021) y lo convierte a (07 Feb. 2021)
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String dateParserPrint(@org.jetbrains.annotations.NotNull()
        java.lang.String dateJson) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}