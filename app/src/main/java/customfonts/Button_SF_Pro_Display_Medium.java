package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

public class Button_SF_Pro_Display_Medium extends Button {
    public Button_SF_Pro_Display_Medium(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public Button_SF_Pro_Display_Medium(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public Button_SF_Pro_Display_Medium(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/SF-Pro-Display-Medium.otf"));
        }
    }
}
