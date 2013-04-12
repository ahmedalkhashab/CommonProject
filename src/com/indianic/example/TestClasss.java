package com.indianic.example;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;

public class TestClasss extends LinearLayout implements OnClickListener, OnTouchListener, OnCheckedChangeListener {

	public TestClasss(Context context) {
		super(context);
	}

	@Override
	public boolean isBaselineAligned() {
		return super.isBaselineAligned();
	}

	@Override
	public void setBaselineAligned(boolean baselineAligned) {
		super.setBaselineAligned(baselineAligned);
	}

	@Override
	public int getBaseline() {
		return super.getBaseline();
	}

	@Override
	public int getBaselineAlignedChildIndex() {
		return super.getBaselineAlignedChildIndex();
	}

	@Override
	public void setBaselineAlignedChildIndex(int i) {
		super.setBaselineAlignedChildIndex(i);
	}

	@Override
	public float getWeightSum() {
		return super.getWeightSum();
	}

	@Override
	public void setWeightSum(float weightSum) {
		super.setWeightSum(weightSum);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

	@Override
	protected void onLayout(boolean changed, int l, int t, int r, int b) {
		super.onLayout(changed, l, t, r, b);
	}

	@Override
	public void setOrientation(int orientation) {
		super.setOrientation(orientation);
	}

	@Override
	public int getOrientation() {
		return super.getOrientation();
	}

	@Override
	public void setGravity(int gravity) {
		super.setGravity(gravity);
	}

	@Override
	public void setHorizontalGravity(int horizontalGravity) {
		super.setHorizontalGravity(horizontalGravity);
	}

	@Override
	public void setVerticalGravity(int verticalGravity) {
		super.setVerticalGravity(verticalGravity);
	}

	@Override
	public LayoutParams generateLayoutParams(AttributeSet attrs) {
		return super.generateLayoutParams(attrs);
	}

	@Override
	protected LayoutParams generateDefaultLayoutParams() {
		return super.generateDefaultLayoutParams();
	}

	@Override
	protected LayoutParams generateLayoutParams(
			android.view.ViewGroup.LayoutParams p) {
		return super.generateLayoutParams(p);
	}

	@Override
	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) {
		return super.checkLayoutParams(p);
	}

	@Override
	public boolean isFocused() {
		return super.isFocused();
	}

	@Override
	public boolean isShown() {
		return super.isShown();
	}

	@Override
	public int getVisibility() {
		return super.getVisibility();
	}

	@Override
	public boolean isEnabled() {
		return super.isEnabled();
	}

	@Override
	public boolean isClickable() {
		return super.isClickable();
	}

	@Override
	public boolean isPressed() {
		return super.isPressed();
	}

	@Override
	public ArrayList<View> getTouchables() {
		return super.getTouchables();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public boolean onKeyLongPress(int keyCode, KeyEvent event) {
		return super.onKeyLongPress(keyCode, event);
	}

	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		return super.onKeyUp(keyCode, event);
	}

	@Override
	public boolean onCheckIsTextEditor() {
		return super.onCheckIsTextEditor();
	}

	@Override
	protected void onCreateContextMenu(ContextMenu menu) {
		super.onCreateContextMenu(menu);
	}

	@Override
	public void cancelLongPress() {
		super.cancelLongPress();
	}

	@Override
	public TouchDelegate getTouchDelegate() {
		return super.getTouchDelegate();
	}

	@Override
	public void bringToFront() {
		super.bringToFront();
	}

	@Override
	public void invalidate(Rect dirty) {
		super.invalidate(dirty);
	}

	@Override
	public void invalidate(int l, int t, int r, int b) {
		super.invalidate(l, t, r, b);
	}

	@Override
	public void invalidate() {
		super.invalidate();
	}

	@Override
	public boolean isOpaque() {
		return super.isOpaque();
	}

	@Override
	public void computeScroll() {
		super.computeScroll();
	}

	@Override
	public boolean isScrollbarFadingEnabled() {
		return super.isScrollbarFadingEnabled();
	}

	@Override
	public IBinder getWindowToken() {
		return super.getWindowToken();
	}

	@Override
	public boolean isInEditMode() {
		return super.isInEditMode();
	}

	@Override
	public void draw(Canvas canvas) {
		super.draw(canvas);
	}

	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
	}

	@Override
	public void invalidateDrawable(Drawable drawable) {
		super.invalidateDrawable(drawable);
	}

	@Override
	public Drawable getBackground() {
		return super.getBackground();
	}

	@Override
	public boolean isSelected() {
		return super.isSelected();
	}

	@Override
	public int getId() {
		return super.getId();
	}

	@Override
	public Object getTag() {
		return super.getTag();
	}

	@Override
	public Object getTag(int key) {
		return super.getTag(key);
	}

	@Override
	public void clearAnimation() {
		super.clearAnimation();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void onClick(View view) {
		
	}

	@Override
	public boolean onTouch(View view, MotionEvent event) {
		return false;
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	}
	
}