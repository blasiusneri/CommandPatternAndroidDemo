package com.x.blas.commanddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.x.blas.commanddemo.command.APageCommand
import com.x.blas.commanddemo.command.BPageCommand
import com.x.blas.commanddemo.command.CPageCommand
import com.x.blas.commanddemo.command.Command

class MainActivity : AppCompatActivity() {

  companion object {
    private const val BUTTON_NUMBER = 3
    private const val BUTTON_ONE = 0
    private const val BUTTON_TWO = 1
    private const val BUTTON_THREE = 2
  }

  private var commands = arrayOfNulls<Command>(BUTTON_NUMBER)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    initCommand()
    initButton()
  }

  private fun initButton() {
    findViewById<Button>(R.id.bt_one).setOnClickListener {
      commands[0]?.execute(this)
    }

    findViewById<Button>(R.id.bt_two).setOnClickListener {
      commands[1]?.execute(this)
    }

    findViewById<Button>(R.id.bt_three).setOnClickListener {
      commands[2]?.execute(this)
    }
  }

  private fun initCommand() {
    val APageCommand = APageCommand()
    val BPageCommand = BPageCommand()
    val CPageCommand = CPageCommand()

    setCommand(BUTTON_ONE, APageCommand)
    setCommand(BUTTON_TWO, APageCommand)
    setCommand(BUTTON_THREE, CPageCommand)
  }

  private fun setCommand(slot: Int, command: Command) {
    this.commands[slot] = command
  }
}