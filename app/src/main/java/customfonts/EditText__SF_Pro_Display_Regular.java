package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class EditText__SF_Pro_Display_Regular extends EditText {
    public EditText__SF_Pro_Display_Regular(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public EditText__SF_Pro_Display_Regular(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public EditText__SF_Pro_Display_Regular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/SF-Pro-Display-Regular.otf"));
        }
    }
}
