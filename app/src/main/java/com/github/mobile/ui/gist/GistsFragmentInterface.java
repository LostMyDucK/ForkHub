package com.github.mobile.ui.gist;

import com.github.mobile.core.ResourcePager;

import org.eclipse.egit.github.core.Gist;
/**
 * Created by josephlilleberg on 3/13/17.
 */

public interface GistsFragmentInterface {
    public ResourcePager<Gist> createPager();
}
