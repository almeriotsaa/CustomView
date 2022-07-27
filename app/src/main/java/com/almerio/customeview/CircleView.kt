package com.almerio.customeview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CircleView(ctx: Context, attr: AttributeSet) : View(ctx, attr) {
    private var radius = 100f

    private var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.RED
        canvas?.drawCircle(radius, radius, radius, paint)
    }

    //onFinishInflate() -> dipanggil setelah view telah selesai di-inflate dari xml
    //onMeasure() -> dipanggil untuk menentukan ukuran view yang akan ditampilkan
    // dan semua turunan viewnya
    //onLayout() -> dipanggil setelah onMeasure() dan setelah semua turunan viewnya selesai di-layout
    //onSizeChanged() -> dipanggil ketika ukuran view berubah
    //onDraw() -> dipanggil untuk menggambar viewnya
}