package com.rtjvm.scala.oop.commands

import com.rtjvm.scala.oop.filesystem.State

/**
  * Created by Aleksandar on 2-Apr-20.
  */
class Pwd extends Command {

  override def apply(state: State): State =
    state.setMessage(state.wd.path)
}
