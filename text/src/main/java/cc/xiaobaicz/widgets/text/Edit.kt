package cc.xiaobaicz.widgets.text

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.widget.EditText

/**
 * Edit
 * 1. 行高适配
 * @see R.styleable.Edit
 * @see R.styleable.Edit_lineHeightX
 * @author xiaobai
 */
@SuppressLint("AppCompatCustomView")
class Edit : EditText {

    private val textAdaptive = TextAdaptive()

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, android.R.attr.editTextStyle)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        textAdaptive.handleSysAttr(this, attrs, defStyleAttr)
        textAdaptive.handleCustomAttr(this, attrs, R.styleable.Edit, defStyleAttr)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        textAdaptive.onMeasure(this, widthMeasureSpec, heightMeasureSpec) { w, h ->
            setMeasuredDimension(w, h)
        }
    }

    override fun setLineHeight(lineHeight: Int) {
        textAdaptive.setLineHeight(this, lineHeight.toFloat())
    }

    override fun getLineHeight(): Int {
        return textAdaptive.lineHeight.toInt()
    }

    override fun setTextSize(unit: Int, size: Float) {
        super.setTextSize(TypedValue.COMPLEX_UNIT_PX, textAdaptive.handleTextSize(this, unit, size))
    }

}