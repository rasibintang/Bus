package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class EditText__SF_Pro_Display_Light extends EditText {
    public EditText__SF_Pro_Display_Light(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public EditText__SF_Pro_Display_Light(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public EditText__SF_Pro_Display_Light(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/SF-Pro-Display-Light.otf"));
        }
    }
}
