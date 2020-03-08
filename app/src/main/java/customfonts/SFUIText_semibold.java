package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class SFUIText_semibold extends EditText {
    public SFUIText_semibold(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public SFUIText_semibold(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public SFUIText_semibold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/sfuitext_semibold.ttf"));
        }
    }
}
