# Text
Android自定义TextView，适配行高，字体大小&amp;组件高度严格受限于行高

### Use
- compileSdk 34
- minSdk 23
- kotlin 1.9.20
- jdk 17

### 引用
~~~ groovy
dependencies {
    implementation 'io.github.xiaobaicz:text:1.2.1'
}
~~~

### 组件
1. Text
2. Edit
3. CheckText
4. AppCompatText
5. AppCompatEdit
6. AppCompatCheckText

### 使用说明
1. lineHeightX 属性：通过指定行高，另Text组件高度严格按照(组件高度 = 行高 * 行数)进行计算，并自适应字体大小为行高的范围
2. includeFontPadding 属性：是否使用预留空白，默认不使用。(中英文一般不需要设置为true，只有一些比较高的文字才需要，如：ရြတ္ျဖစ္သြားမယ္)
~~~ xml
<io.github.xiaobaicz.text.Text
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:background="#ff0"
    android:text="Hello\nHello"
    android:textColor="#000"
    android:textSize="50sp"
    android:includeFontPadding="true"
    app:lineHeightX="100dp" />
    
<io.github.xiaobaicz.text.Edit
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:background="#ff0"
    android:text="Hello\nHello"
    android:textColor="#000"
    android:textSize="50sp"
    android:includeFontPadding="true"
    app:lineHeightX="100dp" />
    
<io.github.xiaobaicz.text.CheckedText
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:background="#ff0"
    android:text="Hello\nHello"
    android:textColor="#000"
    android:textSize="50sp"
    android:includeFontPadding="true"
    app:lineHeightX="100dp" />
~~~
