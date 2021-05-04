package com.example.listadofactura.data;

import java.lang.System;

@androidx.room.Database(entities = {com.example.listadofactura.data.model.Bill.class}, version = 1)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/listadofactura/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "BillDao", "Lcom/example/listadofactura/data/dao/BillDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static com.example.listadofactura.data.AppDatabase intance;
    private static final int NUMBER_OF_THREADS = 1;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.ExecutorService databaseWriteExecutor = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.listadofactura.data.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.listadofactura.data.dao.BillDao BillDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/listadofactura/data/AppDatabase$Companion;", "", "()V", "NUMBER_OF_THREADS", "", "databaseWriteExecutor", "Ljava/util/concurrent/ExecutorService;", "getDatabaseWriteExecutor", "()Ljava/util/concurrent/ExecutorService;", "intance", "Lcom/example/listadofactura/data/AppDatabase;", "create", "", "context", "Landroid/content/Context;", "getIntance", "app_debug"})
    public static final class Companion {
        
        public final void create(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.listadofactura.data.AppDatabase getIntance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.concurrent.ExecutorService getDatabaseWriteExecutor() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}