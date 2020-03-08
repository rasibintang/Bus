package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class MyTextView_SF_Pro_Display_Bold extends TextView {
    public MyTextView_SF_Pro_Display_Bold(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public MyTextView_SF_Pro_Display_Bold(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public MyTextView_SF_Pro_Display_Bold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/SF-Pro-Display-Bold.otf"));
        }
    }
}
