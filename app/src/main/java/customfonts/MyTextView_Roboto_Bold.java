package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class MyTextView_Roboto_Bold extends TextView {
    public MyTextView_Roboto_Bold(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public MyTextView_Roboto_Bold(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public MyTextView_Roboto_Bold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Bold.ttf"));
        }
    }
}
