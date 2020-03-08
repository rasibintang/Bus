package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

public class Button_sfuitext_regular extends Button {
    public Button_sfuitext_regular(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public Button_sfuitext_regular(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public Button_sfuitext_regular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/sfuitext_regular.ttf"));
        }
    }
}
