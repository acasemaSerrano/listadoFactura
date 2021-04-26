package com.example.listadofactura.databinding;
import com.example.listadofactura.R;
import com.example.listadofactura.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFilterBillBindingImpl extends FragmentFilterBillBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView, 1);
        sViewsWithIds.put(R.id.textView2, 2);
        sViewsWithIds.put(R.id.textView4, 3);
        sViewsWithIds.put(R.id.textView3, 4);
        sViewsWithIds.put(R.id.bttdateFrom, 5);
        sViewsWithIds.put(R.id.bttDateTo, 6);
        sViewsWithIds.put(R.id.barrier2, 7);
        sViewsWithIds.put(R.id.textView5, 8);
        sViewsWithIds.put(R.id.tvMinMoney, 9);
        sViewsWithIds.put(R.id.textView8, 10);
        sViewsWithIds.put(R.id.tvMaxMoney, 11);
        sViewsWithIds.put(R.id.sldImporte, 12);
        sViewsWithIds.put(R.id.textView9, 13);
        sViewsWithIds.put(R.id.cbPagada, 14);
        sViewsWithIds.put(R.id.cbAnulada, 15);
        sViewsWithIds.put(R.id.cbCuotaFigada, 16);
        sViewsWithIds.put(R.id.cbPendientePago, 17);
        sViewsWithIds.put(R.id.cbPlanPago, 18);
        sViewsWithIds.put(R.id.bttAplicar, 19);
        sViewsWithIds.put(R.id.bttEliminarFiltro, 20);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFilterBillBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentFilterBillBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.Barrier) bindings[7]
            , (android.widget.Button) bindings[19]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[20]
            , (android.widget.Button) bindings[5]
            , (android.widget.CheckBox) bindings[15]
            , (android.widget.CheckBox) bindings[16]
            , (android.widget.CheckBox) bindings[14]
            , (android.widget.CheckBox) bindings[17]
            , (android.widget.CheckBox) bindings[18]
            , (com.google.android.material.slider.RangeSlider) bindings[12]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}