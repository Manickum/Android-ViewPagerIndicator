package com.viewpagerindicator;

import android.view.View;

public interface IconPagerAdapter {
    /**
     * Get icon representing the page at {@code index} in the adapter.
     */
    int getIconResId(int index);

    // From PagerAdapter
    int getCount();
    
    /**
     * Adding the ability to pass a view to the IconPager 
     * Oliver Manickum manickum@gmail.com
     * 2013/03/12
     */
    View getImageView(int index);
    
    int getBackgroundImageColor ();
}
