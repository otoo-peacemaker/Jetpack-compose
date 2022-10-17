package com.peacecodetech.basicstatecodelab.util

import com.peacecodetech.basicstatecodelab.model.WellnessTask

 fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }