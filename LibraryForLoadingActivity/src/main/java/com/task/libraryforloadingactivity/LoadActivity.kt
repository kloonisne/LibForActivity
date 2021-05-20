package com.task.libraryforloadingactivity

import android.app.Activity
import android.content.Intent

class LoadActivity {
    companion object{
        fun load(ctx:Activity){
            ctx.startActivity(Intent(ctx,FirstPage::class.java))
        }
    }
}