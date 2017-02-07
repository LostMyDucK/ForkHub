package com.github.mobile.core.commit;

import com.github.mobile.ui.StyledText;
import android.view.View.OnClickListener;
import java.util.Date;


public interface StyledTextInterface {
    public StyledText append(final CharSequence text, final Object span);

    public StyledText append(char text);

    public StyledText append(CharSequence text);

    /**
     * Append text and span to end of this text
     *
     * @param text
     * @param span
     * @return this text
     */
    public StyledText append(final char text, final Object span);

    /**
     * Append text in bold
     *
     * @param text
     * @return this text
     */
    public StyledText bold(final CharSequence text);

    /**
     * Append text in bold
     *
     * @param text
     * @param color
     * @return this text
     */
    public StyledText background(final CharSequence text, final int color) ;


    /**
     * Append text in with custom foreground color
     *
     * @param text
     * @param color
     * @return this text
     */
    public StyledText foreground(final CharSequence text, final int color);

    /**
     * Append text in with custom foreground color
     *
     * @param text
     * @param color
     * @return this text
     */
    public StyledText foreground(final char text, final int color);

    /**
     * Append text in monospace typeface
     *
     * @param text
     * @return this text
     */
    public StyledText monospace(final CharSequence text);

    /**
     * Append text as URL
     *
     * @param text
     * @param listener
     * @return this text
     */
    public StyledText url(final CharSequence text,
                          final OnClickListener listener);


    /**
     * Append text as URL
     *
     * @param text
     * @return this text
     */
    public StyledText url(final CharSequence text);

    /**
     * Append given date in relative time format
     *
     * @param date
     * @return this text
     */
    public StyledText append(final Date date);
}