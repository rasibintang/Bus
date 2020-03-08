package customfonts;

import android.content.Context;

import android.util.AttributeSet;
import android.view.View;
import android.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class ScrollingToolbarBehavior extends CoordinatorLayout.Behavior<Toolbar> {
    public ScrollingToolbarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, Toolbar toolbar, View view) {
        return view instanceof AppBarLayout;
    }

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, Toolbar toolbar, View view) {
        if (view instanceof AppBarLayout) {
            int height = toolbar.getHeight();
            float f = (float) (-height);
            toolbar.setTranslationY(f * (view.getY() / ((float) toolbar.getHeight())));
        }
        return true;
    }
}
