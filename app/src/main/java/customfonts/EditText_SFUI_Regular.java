package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class EditText_SFUI_Regular extends EditText {
    public EditText_SFUI_Regular(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public EditText_SFUI_Regular(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public EditText_SFUI_Regular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/sfuitext_regular.ttf"));
        }
    }
}
