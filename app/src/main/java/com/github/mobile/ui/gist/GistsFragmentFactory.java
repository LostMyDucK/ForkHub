package com.github.mobile.ui.gist;

/**
 * Created by josephlilleberg on 3/13/17.
 */

public class GistsFragmentFactory {
    public GistsFragmentInterface makeGistFragment(int position){
        switch (position) {
            case 0:
                return new MyGistsFragment();
            case 1:
                return new StarredGistsFragment();
            case 2:
                return new PublicGistsFragment();
            default:
                return null;
        }
    }
}
