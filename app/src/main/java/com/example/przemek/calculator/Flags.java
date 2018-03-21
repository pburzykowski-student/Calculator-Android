package com.example.przemek.calculator;

/**
 * Created by Przemek on 19.03.2018.
 */

public class Flags {

    private boolean isDotAllowed;
    private boolean isEqualAllowed;
    private boolean isInitialValue;
    private boolean isError;

    public Flags(){
        isDotAllowed = false;
        isEqualAllowed = false;
        isInitialValue = true;
        isError = false;
    }

    public boolean isDotAllowed() {
        return isDotAllowed;
    }

    public void setDotAllowed(boolean dotAllowed) {
        isDotAllowed = dotAllowed;
    }

    public boolean isEqualAllowed() {
        return isEqualAllowed;
    }

    public void setEqualAllowed(boolean equalAllowed) {
        isEqualAllowed = equalAllowed;
    }

    public boolean isInitialValue() {
        return isInitialValue;
    }

    public void setInitialValue(boolean initialValue) {
        isInitialValue = initialValue;
    }

    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
    }
}
