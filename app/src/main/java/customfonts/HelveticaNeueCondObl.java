package customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class HelveticaNeueCondObl extends TextView {
    public HelveticaNeueCondObl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public HelveticaNeueCondObl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public HelveticaNeueCondObl(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/HelveticaNeue-CondObl.ttf"));
        }
    }
}
