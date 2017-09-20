package com.rievo.library;

/**
 * Created by kwang on 2017-09-13.
 */

/**
 * Interface for BackStacks
 */
public interface BStack {

    /**
     * Go back function
     * @return true if goBack was successful
     */
    boolean goBack();
    void destroy();
}
