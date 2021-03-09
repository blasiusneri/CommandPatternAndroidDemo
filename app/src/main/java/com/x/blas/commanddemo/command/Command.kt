package com.x.blas.commanddemo.command

import android.content.Context

/**
 * Created by blasius.n.puspika on 09/03/21.
 */
interface Command {

  fun execute(context: Context)
}