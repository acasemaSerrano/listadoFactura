package com.example.listadofactura.data.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.listadofactura.data.model.Bill;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BillDao_Impl implements BillDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Bill> __insertionAdapterOfBill;

  private final EntityDeletionOrUpdateAdapter<Bill> __deletionAdapterOfBill;

  public BillDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBill = new EntityInsertionAdapter<Bill>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Bill` (`descEstado`,`importeOrdenacion`,`fecha`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Bill value) {
        if (value.getDescEstado() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getDescEstado());
        }
        stmt.bindDouble(2, value.getImporteOrdenacion());
        stmt.bindLong(3, value.getFecha());
      }
    };
    this.__deletionAdapterOfBill = new EntityDeletionOrUpdateAdapter<Bill>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Bill` WHERE `fecha` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Bill value) {
        stmt.bindLong(1, value.getFecha());
      }
    };
  }

  @Override
  public Object insert(final Bill bill, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfBill.insert(bill);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final List<Bill> bills, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfBill.insert(bills);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final Bill bill, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfBill.handle(bill);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getAll(final Continuation<? super List<Bill>> p0) {
    final String _sql = "SELECT * FROM bill";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Bill>>() {
      @Override
      public List<Bill> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDescEstado = CursorUtil.getColumnIndexOrThrow(_cursor, "descEstado");
          final int _cursorIndexOfImporteOrdenacion = CursorUtil.getColumnIndexOrThrow(_cursor, "importeOrdenacion");
          final int _cursorIndexOfFecha = CursorUtil.getColumnIndexOrThrow(_cursor, "fecha");
          final List<Bill> _result = new ArrayList<Bill>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Bill _item;
            final String _tmpDescEstado;
            if (_cursor.isNull(_cursorIndexOfDescEstado)) {
              _tmpDescEstado = null;
            } else {
              _tmpDescEstado = _cursor.getString(_cursorIndexOfDescEstado);
            }
            final double _tmpImporteOrdenacion;
            _tmpImporteOrdenacion = _cursor.getDouble(_cursorIndexOfImporteOrdenacion);
            final long _tmpFecha;
            _tmpFecha = _cursor.getLong(_cursorIndexOfFecha);
            _item = new Bill(_tmpDescEstado,_tmpImporteOrdenacion,_tmpFecha);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
