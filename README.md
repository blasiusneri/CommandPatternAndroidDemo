# CommandPatternAndroidDemo

![](command_android.gif)

*set button action to use command 
```
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
```

*define each command to do concreate command using setCommand
```
private fun initCommand() {
    val APageCommand = APageCommand()
    val BPageCommand = BPageCommand()
    val CPageCommand = CPageCommand()

    setCommand(BUTTON_ONE, APageCommand)
    setCommand(BUTTON_TWO, APageCommand)
    setCommand(BUTTON_THREE, CPageCommand)
  }
```

