package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class TextView_Helvetica_Neue_bold extends TextView {
    public TextView_Helvetica_Neue_bold(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public TextView_Helvetica_Neue_bold(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public TextView_Helvetica_Neue_bold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/helvetica-neue-bold.ttf"));
        }
    }
}
