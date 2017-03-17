package com.github.mobile.ui.search;

import android.content.Context;

/**
 * Created by josephlilleberg on 3/13/17.
 */

public interface SearchInterface {
    public void onAttach(Context context);
    public void refresh();
    public void refreshWithProgress();
}
