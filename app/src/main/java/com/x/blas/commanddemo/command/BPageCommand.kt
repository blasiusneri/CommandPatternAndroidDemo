package com.x.blas.commanddemo.command

import android.content.Context
import android.content.Intent
import com.x.blas.commanddemo.ActivityB

/**
 * Created by blasius.n.puspika on 09/03/21.
 */

class BPageCommand : Command {

    override fun execute(context: Context) {
        context.startActivity(Intent(context, ActivityB::class.java))
    }
}