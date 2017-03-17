package com.github.mobile.ui.search;

/**
 * Created by josephlilleberg on 3/13/17.
 */

public class SearchFactory {
    public SearchInterface makeSearchFragment(int position){
        switch (position) {
            case 0:
                return new SearchRepositoryListFragment();
            case 1:
                return new SearchUserListFragment();
            default:
                return null;
        }
    }
}
