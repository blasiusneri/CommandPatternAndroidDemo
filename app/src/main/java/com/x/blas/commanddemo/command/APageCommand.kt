package com.x.blas.commanddemo.command

import android.content.Context
import android.content.Intent
import com.x.blas.commanddemo.ActivityA

/**
 * Created by blasius.n.puspika on 09/03/21.
 */

class APageCommand : Command {

    override fun execute(context: Context) {
        context.startActivity(Intent(context, ActivityA::class.java))
    }

}