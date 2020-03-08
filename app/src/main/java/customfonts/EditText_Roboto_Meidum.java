package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class EditText_Roboto_Meidum extends EditText {
    public EditText_Roboto_Meidum(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public EditText_Roboto_Meidum(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public EditText_Roboto_Meidum(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Medium.ttf"));
        }
    }
}
