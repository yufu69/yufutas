package com.hatenablog.yufutech.yufutas

import javax.inject.Named

@Named
class TaskUseCase(private val taskPort: TaskPort) {
    fun register(task: Task) {
        taskPort.register(task)
    }
}
