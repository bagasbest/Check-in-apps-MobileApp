package com.check_inhotelorinn;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

public class Custom_myButton extends AppCompatButton {

    private Drawable enabledBg, disableBg;
    private int textColor;

    public Custom_myButton(Context context) {
        super(context);
        init();
    }

    public Custom_myButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Custom_myButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        textColor = ContextCompat.getColor(getContext(), android.R.color.background_light);
        enabledBg = getResources().getDrawable(R.drawable.bg_button);
        disableBg = getResources().getDrawable(R.drawable.bg_button_disable);
    }

    @Override
    protected void onDraw (Canvas canvas){
        super.onDraw(canvas);
        setBackground(isEnabled() ? enabledBg : disableBg);
        setTextColor(textColor);
        setTextSize(12.f);
        setGravity(Gravity.CENTER);
        setText(isEnabled() ? "Submit" : "Isi dulu");
    }
}
