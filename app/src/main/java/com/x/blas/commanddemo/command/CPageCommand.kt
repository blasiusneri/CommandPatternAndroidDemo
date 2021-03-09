package com.x.blas.commanddemo.command

import android.content.Context
import android.content.Intent
import com.x.blas.commanddemo.ActivityC

/**
 * Created by blasius.n.puspika on 09/03/21.
 */

class CPageCommand : Command {

    override fun execute(context: Context) {
        context.startActivity(Intent(context, ActivityC::class.java))
    }
}